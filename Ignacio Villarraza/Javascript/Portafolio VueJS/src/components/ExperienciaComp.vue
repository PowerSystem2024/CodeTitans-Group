<script setup>
import { ref } from 'vue'
const titulo = 'Desarrollador iOS & Multiplataforma'
const fecha = 'Desde Enero 2022 / Julio 2024'
const experiencias = ref([
  {
    id: 1,
    src: '/src/assets/iphone.svg',
    parrafo:
      'Creacion de aplicaciones moviles de manera Freelance para Gimnasios, Agencias de Viajes y otras organizaciones educativas.',
  },
  {
    id: 2,
    src: '/src/assets/database.svg',
    parrafo:
      'Creacion y mantenimiento de bases de datos para aplicaciones moviles.',
  },
  {
    id: 3,
    src: '/src/assets/maintenance.svg',
    parrafo:
      'Realize mantenimiento de aplicaciones moviles creadas por otros desarrolladores',
  },
  {
    id: 4,
    src: '/src/assets/ux-mobile.svg',
    parrafo:
      'Colaboré con diseñadores de UX para mejorar la experiencia de usuario en aplicaciones moviles ya existentes.',
  },
])
</script>

<template>
  <div class="card">
    <h3 class="titulo">{{ titulo.toLocaleUpperCase() }}</h3>
    <p class="fecha">{{ fecha }}</p>
    <ul class="listado">
      <li class="item" v-for="experencia in experiencias" :key="experencia.id">
        <img
          class="imagen-svg"
          :src="experencia.src"
          width="45rem"
          :alt="experencia.parrafo"
        />
        <p>{{ experencia.parrafo }}</p>
      </li>
    </ul>
  </div>
</template>

<style scoped>
.card {
  display: flex;
  flex-direction: column;
  padding: 2rem;
  background-color: rgb(26, 26, 26);
  filter: drop-shadow(1px 1px 5px var(--vt-c-indigo));
  border-radius: 15px;
}

.titulo {
  font-size: 1.5rem;
  color: #fff;
}

.fecha {
  font-size: 1rem;
  color: burlywood;
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
  color: #fff;
  font-size: small;
}
</style>
