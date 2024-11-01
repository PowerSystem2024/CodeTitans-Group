<script setup>
import { ref } from 'vue';

const intereses = ref([
    "Desarrollo de Software",
    "Inteligencia Artificial",
    "Machine Learning",
    "Data Science",
    "Seguridad Informatica",
    "Redes de Computadoras",
    "Desarrollo Web",
    "Desarrollo Movil",
    "Desarrollo de Videojuegos",
    "Realidad Virtual y Aumentada",
]);

</script>
<template>
    <div class="intereses-contenedor">
        <ul class="lista-intereses">
            <li v-for="interes in intereses" :key="interes" class="item-interes">{{ interes }}</li>
        </ul>
    </div>
</template>



<style scoped>
.intereses-contenedor {
    padding: 2rem;
    margin: 1rem;
    display: flex;
    justify-content: center;
    align-items: center;
    background-color: azure;
    box-shadow: 0 0 10px var(--vt-c-indigo);
    border-radius: 15px;
    cursor: pointer;
}

.lista-intereses {
    display: flex;
    flex-wrap: wrap;
    justify-content: center;
    align-items: center;
    gap: 8px;
}

.item-interes {
    background-color: #ddd;
    padding: 5px 10px;
    border-radius: 16px;
    box-shadow: 0 0 10px var(--vt-c-indigo);
}
</style>