<script setup>
import NavBar from './components/NavBar.vue';
import DatosPersonales from './components/DatosPersonales.vue';
import ProyectosComp from './components/ProyectosComp.vue';
import ComponenteEducacion from './components/ComponenteEducacion.vue';
import Intereses from './components/Intereses.vue';
import HabilidadesComp from './components/HabilidadesComp.vue';
import ExperienciaComponente from './components/ExperienciaComponente.vue';
</script>

<template>
  <header>
    <!--Barra de Navegacion-->
    <NavBar />
    <!-- Datos personales -->
    <DatosPersonales />
  </header>
  <main>
    <section id="educacion">
      <h2>Educación - Cursos</h2>
      <ComponenteEducacion />
    </section>
    <section id="experiencia">
      <h2>Experiencia</h2>
      <ExperienciaComponente />
    </section>
    <section id="proyectos">
      <h2>Proyectos</h2>
      <ProyectosComp />
    </section>
    <section id="habilidades">
      <h2>Habilidades</h2>
      <HabilidadesComp />
    </section>
    <section id="intereses">
      <h2>Intereses</h2>
      <Intereses />
    </section>
  </main>
  <footer>
    <a href="#top">Inicio</a>
    <p>© 2024 CodeTitans - Portafolio Web - UTN</p>
  </footer>
</template>

<style scoped>
footer {
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  background-color: azure;
  color: #333;
  border-radius: 10px;
  padding: 20px;
  margin-top: 30px;
  cursor: pointer;
  box-shadow: 0 0 10px var(--vt-c-indigo);
  background-size: 400% 400%;
}

footer a {
  color: #333;
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
