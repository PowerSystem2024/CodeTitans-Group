<script setup>
import NavBar from './components/NavBar.vue'
import DatosPersonales from './components/DatosPersonales.vue'
import MiEducacion from './components/MiEducacion.vue';
import MiExperiencia from './components/MiExperiencia.vue';
import ProyectoComponent from './components/ProyectoComponent.vue';
import HabilidadesComponent from './components/HabilidadesComponent.vue';
import InteresesComponent from './components/InteresesComponent.vue';
</script>

<template>
  <header id="top">
    <!--Barra de Navegacion-->
    <NavBar />
    <!--Componente Datos Personales-->
    <DatosPersonales />
  </header>

  <main>
    <section id="educacion">
      <h2>Educación - Cursos</h2>
      <MiEducacion />
    </section>
    <section id="experiencia">
      <h2>Experiencia</h2>
      <MiExperiencia />
    </section>
    <section id="proyectos">
      <h2>Proyectos</h2>
      <ProyectoComponent />
    </section>
    <section id="habilidades">
      <h2>Habilidades</h2>
      <HabilidadesComponent />
    </section>
    <section id="intereses">
      <h2>Intereses</h2>
      <InteresesComponent />
    </section>
  </main>

  <footer>
    <a href="#top">Inicio</a>
    <p>© 2024 Leandro Gonzalez - Portafolio Web</p>
  </footer>
</template>

<style scoped>
footer {
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  background-color: rgb(26, 26, 26);
  color: azure;
  padding: 20px;
  margin-top: 30px;
  cursor: pointer;
}

footer a {
  color: white;
  text-decoration: none;
  margin-bottom: 10px;
}

footer p {
  margin: 0;
}

footer :hover {
  color: rgb(66, 184, 131);
}
</style>
