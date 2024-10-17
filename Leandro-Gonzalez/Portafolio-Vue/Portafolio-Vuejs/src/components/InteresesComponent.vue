<script setup>
import { ref } from 'vue'


const intereses = ref([
    "Desarrollo Web: Frontend y Backend con tecnologías como HTML, CSS, JavaScript, Node.js, Express, MongoDB, Vue.js, React, etc. Son tecnologías que me apasionan",
    "Desarrollo de Software: Java y Python son lenguajes en los que me estoy formando",
    "Tecnologías: Me gusta investigar sobre nuevas tecnologías y probarlas",
    "Deportes: Voy al gimnasio de manera regular 4 veces por semana",
])

</script>

<template>
    <div class="intereses-contenedor">

        <ul class="contenedor-lista">
            <li class="item" v-for="interes in intereses" :key="interes">{{ interes }}</li>
        </ul>

    </div>
</template>


<style scoped>
.intereses-contenedor {
    display: flex;
    justify-content: center;
    align-items: center;
    height: 100%;
    background-color: rgb(26, 26, 26);
    padding: 20px;
    margin-top: 20px;
    filter: drop-shadow(1px 1px 5px rgb(66, 184, 131));

}

.contenedor-lista {
    list-style: none;
    padding: 0;
    margin: 0;
    display: flex;
    flex-wrap: wrap;
    justify-content: center;
    gap: 1rem;
}

.item {
    padding: 0.5rem;
    margin: 0.5rem;
    color: rgb(26, 26, 26);
    background-color: rgb(66, 184, 131);
    border-radius: 0.5rem;
    font-size: 1.2rem;
    font-weight: bold;
    text-align: center;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    cursor: pointer;
    transition: all 0.3s;

}
</style>