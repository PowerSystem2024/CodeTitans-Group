<script setup>
import NavBar from './components/NavBar.vue'
import DatosPersonales from './components/DatosPersonales.vue'
import EducacionComp from './components/EducacionComp.vue'
import ExperienciaComp from './components/ExperienciaComp.vue'
import ProyectosComp from './components/ProyectosComp.vue'
import HabilidadesComp from './components/HabilidadesComp.vue'
import InteresesComp from './components/InteresesComp.vue'
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
    <InteresesComp />
  </main>
  <footer>
    <a href="#top">Inicio</a>
    <p>© 2024 Ignacio Villarraza - Portafolio Web</p>
  </footer>
</template>

<style scoped>
a {
  color: #fff;
}
footer {
  display: flex;
  flex-direction: column;
  align-items: center;
  padding: 2rem;
  font-size: 1.3rem;
}
</style>
