<script setup>
import NavBar from './components/NavBar.vue'
import DatosPersonales from './components/DatosPersonales.vue'
import EducacionComp from './components/EducacionComp.vue'
import ExperienciaComp from './components/ExperienciaComp.vue'
import ProyectosComp from './components/ProyectosComp.vue'
import HabilidadesComp from './components/HabilidadesComp.vue'
</script>

<template>
  <header>
    <!-- Barra de Navegacion -->
    <NavBar />
  </header>
  <main>
    <DatosPersonales />

    <section id="educacion"><h2>Educacion - Cursos</h2></section>
    <EducacionComp />
    <section id="experiencia"><h2>Experiencia</h2></section>
    <ExperienciaComp />
    <section id="proyectos"><h2>Proyectos</h2></section>
    <ProyectosComp />
    <section id="habilidades"><h2>Habilidades</h2></section>
    <HabilidadesComp />
    <section id="intereses"><h2>Intereses</h2></section>
  </main>
</template>

<style scoped></style>
