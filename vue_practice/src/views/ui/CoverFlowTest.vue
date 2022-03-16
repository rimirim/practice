<template>
    <div>
        <coverflow :coverList="coverList" :coverWidth="260" :index="2"/>
    </div>
</template>

<script>

import coverflow from 'vue-coverflow'

export default {
    name: 'CoverflowTestPage',
    data () {
        return {
            coverList: [
                {
                    cover: require('@/assets/logo.png'),
                    title: '듄'
                },
                 {
                    cover: require('@/assets/logo.png'),
                    title: '듄'
                },
                 {
                    cover: require('@/assets/logo.png'),
                    title: '듄'
                },
                 {
                    cover: require('@/assets/logo.png'),
                    title: '듄'
                }
              
            ]
        }
    },
    components: {
        coverflow
    }
}

</script>