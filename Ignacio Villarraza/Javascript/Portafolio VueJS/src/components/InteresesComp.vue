<script setup>
import { ref } from 'vue'
import FondoLava from './FondoLava.vue'
//Este es un arreglo con ref para que se pueda reactivar el cambio de los intereses
const intereses = ref([
  'Desarrollo de Software de Código Abierto: Contribuir a Proyectos Open Source para mejorar mis habilidades como Desarrollador',
  'Data Science: Me apasiona explorar nuevas tendencias tecnológicas como la Ciencia de Datos y la Inteligencia Artificial.',
  'Deportes: Concurro regularmente al gimnasio, actividad la cual combino con Running al aire libre los fines de semana',
  'Edicion de Video y Motion Graphics: Como Hobby me gusta crear y editar videos con Adobe Premiere Pro y crear animaciones con After Effects',
])
</script>

<template>
  <div class="intereses-contenedor">
    <FondoLava />
    <ul class="contenedor-lista">
      <li class="item" v-for="interes in intereses" :key="interes">
        {{ interes }}
      </li>
    </ul>
  </div>
</template>

<style scoped>
.intereses-contenedor {
  display: flex;
  position: relative;
  margin: 0 auto;
  max-width: 85%;
  padding: 1rem;
  border-radius: 15px;
  filter: drop-shadow(1px 1px 5px var(--vt-c-indigo));
}

.contenedor-lista {
  list-style-type: none;
  padding: 1rem;
  margin-bottom: 0.5rem;
  color: var(--vt-c-white-soft);
  font-size: 1.4rem;
  text-shadow: 3px 3px 6px rgba(0, 0, 0, 1);
}

.item {
  margin-bottom: 1rem;
}
</style>
