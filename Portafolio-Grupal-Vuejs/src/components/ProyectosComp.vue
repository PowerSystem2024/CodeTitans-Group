<script setup>
import { ref } from 'vue';

const misProyectos = ref([
  {
    id: 1,
    scr: '/src/assets/images/pseint.png',
    titulo: 'DataBase Admin',
    descripcion:
      'Aplicacion creada como proyecto integrador en Pseudo-Codigo con PSeInt para la Materia Fundamentos de Programacion',
    proyectoLink: 'https://www.google.com.ar',
    githubLink: 'https://github.com/PowerSystem2024/CodeTitans-Group',
  },
  {
    id: 2,
    scr: '/src/assets/images/database.png',
    titulo: 'MySql',
    descripcion:
      'DataBase creada para los proyectos y actividades de la materia BASES DE DATOS I del Segundo Semestre',
    proyectoLink: 'https://www.google.com.ar',
    githubLink: 'https://github.com/PowerSystem2024/CodeTitans-Group',
  },
  {
    id: 3,
    scr: '/src/assets/images/java.png',
    titulo: 'DataBase Admin Java',
    descripcion:
      'Proyecto Integrador del semestre anterior que realizamos en PSeInt pero ahora Migrado al lenguaje Java',
    proyectoLink: 'https://github.com/PowerSystem2024/CodeTitans-Group',
    githubLink:
      'https://github.com/NashVille912/SwiftUIProjects/tree/main/GuessTheFlag',
  },
]);
</script>

<template>
  <div class="galeria">
    <li class="proyecto" v-for="proyecto in misProyectos" :key="proyecto.id">
      <img :src="proyecto.scr" :alt="proyecto.id" />
      <div class="proyecto-info">
        <h3>{{ proyecto.titulo }}</h3>
        <p>
          {{ proyecto.descripcion }}
        </p>
        <div class="proyecto-links">
          <a :href="proyecto.proyectoLink" class="btn-ver-mas" target="_blank" rel="noopener noreferrer">Ver
            Proyecto</a>
          <a :href="proyecto.githubLink" class="github-link" target="_blank" rel="noopener noreferrer">Ver Código en
            GitHub</a>
        </div>
      </div>
    </li>
  </div>
</template>

<style scoped>
.galeria {
  height: 100%;
  display: flex;
  flex-wrap: wrap;
  justify-content: center;
  background-color: azure;
  border-radius: 10px;
  gap: 20px;
  padding: 20px;
  margin: 1rem;
  box-shadow: 0 0 10px var(--vt-c-indigo);
  background-size: 400% 400%;
}

@keyframes gradient {
  0% {
    background-position: 0% 50%;
  }

  50% {
    background-position: 100% 50%;
  }

  100% {
    background-position: 0% 50%;
  }
}

.proyecto {
  display: flex;
  flex-direction: column;
  border: 1px solid rgba(71, 71, 71, 0.521);
  overflow: hidden;
  background-color: #daeeee;
  filter: drop-shadow(1px 1px 5px var(--vt-c-indigo));
  border-radius: 15px;
  max-width: 222px;
  flex: 1 1 300px;
  cursor: pointer;
}

.proyecto img {
  width: 100%;
  height: auto;
  display: block;
}

.proyecto-info {
  padding: 15px;
  text-align: center;
}

.proyecto-info h3 {
  margin: 10px 0;
  font-size: 1.3em;
  color: #272727;
}

.proyecto-info p {
  margin: 10px 0;
  font-size: 1em;
  color: #272727;
}

.proyecto-links {
  display: flex;
  flex-direction: column;
  gap: 10px;
  margin-top: 10px;
}

.proyecto-links .btn-ver-mas {
  background-color: #daeeee;
  border: 1px solid #d6dfdf;
  color: #272727;
  padding: 10px 15px;
  border-radius: 5px;
  text-decoration: none;
  transition: background-color 1s;
}

.proyecto-links .btn-ver-mas:hover {
  background-color: #d6dfdf;
  color: #272727;
}

.proyecto-links .github-link {
  color: #272727;
  text-decoration: none;
  font-size: 0.9em;
}

.proyecto-links .github-link:hover {
  text-decoration: underline;
}
</style>
