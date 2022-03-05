<template>
    <div id="board">
        <h2> Vue + Spring 게시판 </h2>
        <p> 게시물 작성 </p>
        <board-list :board="boards"/>
    </div>
</template>

<script>

import BoardList from '@/components/board/BoardList.vue'
export default {
    name: 'BoardListPage',
    components: {
        BoardList
    }
}
</script>