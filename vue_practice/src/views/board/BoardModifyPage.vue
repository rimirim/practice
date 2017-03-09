<template>
    <div align="center">
        <h2> Vue + Spring 게시물 수정 </h2>
        <board-modify-form v-if="board" :board="board" @submit="onSubmit"/>
        <p v-else> 로딩중 ..... </p>

    </div>
</template>

<script>
import axios from 'axios'
import { mapActions, mapState } from 'vuex'
import BoardModifyForm from '@/components/board/BoardModifyForm'

export default {
    name: 'BoardModifyPage',
    components: {
        BoardModifyForm
    },
    props: {
        boardNo: {
            type: String,
            requried: true
        }
    },
    computed: {
        ...mapState(['board'])
    },
    methods: {
        ...mapActions(['fetchBoard']),
        onSubmit (payload) {
            const { title, content } = payload

            axios.put(`http://localhost:7777/vueBoard/${this.boardNo}`, {title, content})
                    .then(res => {
                        alert('게시물 수정 성공!')
                        this.$router.push({
                            name: 'BoardReadPage',
                            params: { boardNp: res.data.boardNo.toString()}

                        })
                    })
                    .catch (() => {
                        alert('게시물 수정 실패!')
                    })
        }
    },
    created () {
        this.fetchBoard(this.boardNo)
                .catch(() => {
                    alert ('게시물 DB 조회 실패!')
                    this.$routher.back()
                })
    }
}
</script>