<!--
aqui se ejecurara el codigo que se encuentra en el scrip,
permite que todo lo que pongamos dentro de script, utilizando doble 
llave puede hacer que funcione de forma reactiva vue
-->
<script setup>
//puro js
import NavBar from './components/NavBar.vue';
import DatosPersonales from './components/DatosPersonales.vue';
import ListaEducacion from './components/ListaEducacion.vue';
import ExperienciaComponente from './components/ExperienciaComponente.vue';
import ProyectoComponente from './components/ProyectoComponente.vue';
import HabilidadesComponente from './components/HabilidadesComponente.vue';
import InteresesComponentes from './components/InteresesComponentes.vue';
</script>





<template> 
<!--dentro del template podemos utilizar html puro
 o JavaScript de forma reactiva de la forma que se hizo arriba-->
  <header>
    <!--Barra de navegacion-->
    <NavBar />
    <!--Componente DatosPersonales-->

    <DatosPersonales />

  </header>
  <main>
    <section id="educacion"><h2>Educación - Cursos</h2>
      <!--Componente DatosPersonales-->
      <ListaEducacion />
    </section>
    <section id="experiencia"><h2>Experiencia</h2>
      <!--Componente DatosPersonales-->
      <ExperienciaComponente />
    </section>
    <section id="proyectos"><h2>Proyectos</h2>
      <!--Componente Proyectos-->
      <ProyectoComponente />
    </section>
    
    <section id="habilidades"><h2>Habilidades</h2>
    <HabilidadesComponente />
    </section>

    <section id="intereses"><h2>Intereses</h2>
    <InteresesComponentes />
    </section>
  </main>
</template>

<style scoped>


</style>
