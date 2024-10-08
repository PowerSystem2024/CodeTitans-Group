<script setup>
import { ref } from 'vue'

const proyectos = ref([
    {
        id: 1,
        nombre: 'Calculadora Clasica Vintage',
        descripcion: 'Creé una plataforma de comercio electrónico que incrementó las ventas en un 35% durante el primer año.',
        imagen: '/src/assets/2021-calculator-pure-css.png',
        urlProyecto: 'https://proyecto1.com',
        urlGithub: '',
    },
    {
        id: 2,
        nombre: 'Formulario de inicio Login',
        descripcion: 'Creé una plataforma de comercio electrónico que incrementó las ventas en un 35% durante el primer año.',
        imagen: '/src/assets/login-blue-tones-768x538.jpg',
        urlProyecto: 'https://proyecto1.com',
        urlGithub: '',
    },
    {
        id: 3,
        nombre: 'To Do List App',
        descripcion: 'Creé una plataforma de comercio electrónico que incrementó las ventas en un 35% durante el primer año.',
        imagen: '/src/assets/todo-list-javascriptapp1.png',
        urlProyecto: 'https://proyecto1.com',
        urlGithub: '',
    },
    {
        id: 4,
        nombre: 'Proyecto Pokemon',
        descripcion: 'Creé una plataforma de comercio electrónico que incrementó las ventas en un 35% durante el primer año.',
        imagen: '/src/assets/pokemon-project.png',
        urlProyecto: 'https://proyecto1.com',
        urlGithub: '',
    },
    {
        id: 5,
        nombre: 'Juego Pac-Man',
        descripcion: 'Creé una plataforma de comercio electrónico que incrementó las ventas en un 35% durante el primer año.',
        imagen: '/src/assets/f6bdf1197653575.Y3JvcCw5OTksNzgyLDAsMTA4.jpg',
        urlProyecto: 'https://proyecto1.com',
        urlGithub: '',
    },
    {
        id: 6,
        nombre: 'Portafolio Personal Cliente',
        descripcion: 'Creé una plataforma de comercio electrónico que incrementó las ventas en un 35% durante el primer año.',
        imagen: '/src/assets/Thumbnail-portafolio_jaume.jpg',
        urlProyecto: 'https://proyecto1.com',
        urlGithub: '',
    },
])

</script>

<template>
    <div class="cards">
        <div v-for="proyecto in proyectos" :key="proyecto.id" class="card">
            <img :src="proyecto.imagen" alt="imagen proyecto" />
            <div class="content">
                <h2>{{ proyecto.nombre }}</h2>
                <p>{{ proyecto.descripcion }}</p>
                <a :href="proyecto.urlProyecto" target="_blank">Ver proyecto</a>
                <a :href="proyecto.urlGithub" target="_blank">Ver código</a>
            </div>
        </div>
    </div>

</template>

<style scoped>
.cards {
    display: flex;
    justify-content: center;
    gap: 20px;
    flex-wrap: wrap;
    background-image: url('/src/assets/2508252.jpg');
    background-size: cover;
    background-position: center;
    background-repeat: no-repeat;
    padding: 20px;
    margin-top: 20px;
    filter: drop-shadow(1px 1px 5px azure);
}

.card {
    width: 300px;
    border: 1px solid #ccc;
    border-radius: 5px;
    overflow: hidden;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    background-color: rgb(26, 26, 26);
    filter: drop-shadow(1px 1px 5px azure);
}

img {
    width: 100%;
    height: 200px;
    object-fit: cover;
}

.content {
    padding: 20px;
}

h2 {
    margin: 0;
    font-size: 20px;
    color: rgb(225, 225, 225);
}

p {
    margin: 10px 0;
    color: rgb(151, 147, 147);
}

a {
    display: block;
    margin-top: 10px;
    text-align: center;
    background-color: rgb(66, 184, 131);
    color: black;
    padding: 10px;
    border-radius: 5px;
    text-decoration: none;
    font-weight: bold;
}

a:hover {
    background-color: rgb(66, 184, 131, 0.8);
    filter: drop-shadow(1px 1px 5px azure);
}
</style>
