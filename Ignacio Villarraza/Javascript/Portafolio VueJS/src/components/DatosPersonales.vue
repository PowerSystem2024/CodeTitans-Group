<script setup>
const title = 'Ignacio Villarraza'
const descripcion = 'Tecnico Universitario en Programacion - UTN FRSR'
const residencia = 'Parana - Entre Rios - Argentina'
const presentacion =
  '¡Hola! Bienvenido a mi portafolio. Soy Nacho, Desarrollador de Aplicaciones Moviles iOS y Multiplataforma'
const redesSociales = [
  {
    id: 1,
    name: 'linkedin',
    src: '/src/assets/linkedin_icon.svg',
    url: 'https://www.linkedin.com/in/nachovillarraza/',
  },
  {
    id: 2,
    name: 'instagram',
    src: '/src/assets/instagram_icon.svg',
    url: 'https://www.instagram.com/navillarraza',
  },
  {
    id: 3,
    name: 'github',
    src: '/src/assets/github_icon.svg',
    url: 'https://github.com/NashVille912',
  },
  {
    id: 4,
    name: 'curriculum',
    src: '/src/assets/cv_resume_icon.svg',
    url: '',
  },
]
const telefono = '+54 9 3435362575'
</script>

<template>
  <section class="datos-personales">
    <div class="card">
      <h1>{{ title }}</h1>
      <h2>{{ descripcion }}</h2>
      <p>{{ presentacion }}</p>
      <ul class="container-lista">
        <li v-for="red in redesSociales" :key="red.id">
          <a :href="red.url"
            ><img
              class="icon-redsocial"
              :src="red.src"
              width="35rem"
              :alt="red.name"
          /></a>
        </li>
      </ul>
      <h3>☎ Teléfono: {{ telefono }}</h3>
      <h4>{{ residencia }}</h4>
    </div>
  </section>
</template>

<style scoped>
h1 {
  font-size: 2.5rem;
  color: #fff;
}

p {
  font-size: 1.2rem;
  font-weight: 600;
  margin-bottom: 1rem;
  color: #fff;
}

.card {
  background-color: rgb(26, 26, 26);
  filter: drop-shadow(1px 1px 5px var(--vt-c-indigo));
  border-radius: 10px;
  padding: 10px;
  margin: 10px;
  text-align: center;
}

.container-lista {
  display: flex;
  justify-content: center;
  list-style: none;
  padding: 0;
  margin: 0;
  text-align: center;
}

.icon-redsocial {
  align-items: center;
  background-color: rgb(20, 26, 31);
  border-radius: 50%;
  padding: 2px;
  margin: 5px;
  box-shadow: 0 0 5px rgba(95, 124, 205, 0.934);
}

.icon-redsocial:hover {
  background-color: rgb(28, 41, 52);
  box-shadow: 0 0 5px rgba(251, 249, 249, 0.934);
}

h3 {
  font-size: 1.2rem;
  font-weight: 600;
}
</style>
