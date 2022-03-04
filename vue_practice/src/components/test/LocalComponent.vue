<template>
    <div>
        {{ num }}
    </div>
</template>

<script>
export default {
    name: 'local-component',
    props: {
        num: Number
    }
}
</script>