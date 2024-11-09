<script setup>
import python from '/src/components/icons/python.svg'
import js from '/src/components/icons/JS.svg'
import java from '/src/components/icons/java.svg'
import mysql from '/src/components/icons/mysql.svg'
import git from '/src/components/icons/git.svg'
import vue from '/src/components/icons/vue.svg'
import uml from '/src/components/icons/uml.svg'
import espaniol from '/src/components/icons/espaniol.svg'
import english from '/src/components/icons/english.svg'
import { ref } from 'vue';

const habilidades = ref([
  {
    id: 1,
    nombre: "Lenguajes de Programacion",
    habilidades: [
      {
        id: 1,
        src: python,
        nombre: "Python",
      },
      {
        id: 2,
        src: js,
        nombre: "Javascript",
      },
      {
        id: 3,
        src: java,
        nombre: "Java",
      },
      {
        id: 4,
        src: mysql,
        nombre: "SQL",
      },
    ],
  },
  {
    id: 2,
    nombre: "Frameworks y Otros",
    habilidades: [
      {
        id: 1,
        src: mysql,
        nombre: "MySQL",
      },
      {
        id: 2,
        src: git,
        nombre: "Git",
      },
      {
        id: 3,
        src: vue,
        nombre: "Vue",
      },
      {
        id: 4,
        src: uml,
        nombre: "UML",
      },
    ],
  },
  {
    id: 3,
    nombre: "Idiomas",
    habilidades: [
      {
        id: 1,
        src: espaniol,
        nombre: "Español",
      },
      {
        id: 2,
        src: english,
        nombre: "Ingles",
      },
    ],
  },
]);
</script>

<template>
  <div class="skills-contenedor">
    <div v-for="habilidad in habilidades" :key="habilidad.id" class="skills-categoria">
      <h3>{{ habilidad.nombre }}</h3>
      <ul class="skills">
        <li v-for="habilidad in habilidad.habilidades" :key="habilidad.id" class="skill">
          <img :src="habilidad.src" alt="habilidad.nombre" />
          <span>{{ habilidad.nombre }}</span>
        </li>
      </ul>
    </div>
  </div>
</template>

<style scoped>
.skills-contenedor {
  padding: 2rem;
  margin: 1rem;
  background-color: azure;
  box-shadow: 0 0 10px var(--vt-c-indigo);
  border-radius: 15px;
  cursor: pointer;
}

.skills-categoria {
  margin-bottom: 20px;
}

.skills-categoria h3 {
  display: flex;
  justify-content: left;
  margin-bottom: 10px;
  font-size: 1.5em;
  color: #333;
  font-size: 1.5em;
  font-weight: normal;
}

.skills {
  display: flex;
  justify-content: space-evenly;
  flex-wrap: wrap;
  gap: 20px;
  color: #333;
}

.skill {
  display: flex;
  justify-content: center;
  align-items: center;
  gap: 10px;
  background-color: rgba(241, 245, 243, 0.288);
  padding: 0.3em;
  border-radius: 8px;
  box-shadow: 0px 4px 12px var(--vt-c-indigo);
  flex: 1 1 200px;
  max-width: 250px;
}

.skill:hover {
  background-color: #daeeee;
  font-size: 1.1em;
  transition: 1s ease-out;
  color: #272727;
}

.skill img {
  width: 35px;
  height: 35px;
}

.skill span {
  font-size: 1em;
}

@media (max-width: 768px) {
  .skills-categoria h3 {
    justify-content: center;
  }

  .skill {
    justify-content: center;
  }
}
</style>
