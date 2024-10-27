<template>
    <div class="copyright">
    © {{ year }} {{ companyName }}
    </div>
</template>

<script>
export default {
    name: "Copyright",
    props: {
    companyName: {
        type: String,
        default: "Mi Compañía"
    }
},
data() {
    return {
    year: new Date().getFullYear()
    };
}
};
</script>

<style scoped>
.copyright {
    font-size: 1rem;
    color: #555;
}
</style>