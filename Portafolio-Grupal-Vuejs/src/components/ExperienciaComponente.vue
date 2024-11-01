<script setup>
import { ref } from 'vue';
const titulo = 'Desarrolladores Full Stack';
const fecha = 'Desde Marzo 2024 a la actualidad';
const experiencias = ref([
    { id: 1, src: '/src/assets/peseint.svg', parrafo: 'Desarrollamos un programa gestor de Base de Datos de personas en pseudo codigo con el programa PSeINT' },
    { id: 2, src: '/src/assets/java.svg', parrafo: 'Modificamos y adaptamos el codigo hecho en PSeINT para traducirlo al lenguaje Java' },
    { id: 3, src: '/src/assets/deploy.svg', parrafo: 'Creamos un portfolio desplegado en la web de nuestro equipo de trabajo' }
]);

</script>

<template>
    <div class="card">
        <h3 class="titulo">{{ titulo }}</h3>
        <p class="fecha">{{ fecha }}</p>
        <ul class="listado">
            <li class="item" v-for="experiencia in experiencias" :key="experiencia.id">
                <img class="imagen-svg" :src="experiencia.src" width="45rem" :alt="experiencia - parrafo">
                <p>{{ experiencia.parrafo }}</p>
            </li>
        </ul>
    </div>
</template>

<style scoped>
.card {
    display: flex;
    flex-direction: column;
    padding: 2rem;
    margin: 1rem;
    background-color: azure;
    gap: 1rem;
    justify-content: center;
    border-radius: 15px;
    border: 1px solid rgba(71, 71, 71, 0.521);
    box-shadow: 0 0 10px var(--vt-c-indigo);
    cursor: pointer;
}

.titulo {
    font-size: 1.5rem;
    color: rgb(41, 73, 63);
}

.fecha {
    font-size: 1rem;
    color: rgb(220, 124, 124);
    margin-bottom: 1rem;
}

.listado {
    display: flex;
    flex-direction: column;
}

.item {
    align-items: center;
    display: flex;
    padding: 1rem;
    gap: 1.5rem;
}
</style>