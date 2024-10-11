<script setup>
const title = 'Leandro Gonzalez'
const description = 'Tecnico Universitario en Programacion - UTN'
const residencia = 'San Miguel de Tucuman - Tucuman - Argentina'
const presentacion =
  'Hola, Bienvenido a mi portafolio de proyectos. Soy un desarrollador Web con experiencia en el desarrollo de App Web y moviles'
const redesSociales = [
  {
    id: 1,
    name: 'linkedin',
    src: '/src/components/icons/linkedin_icon.svg',
    url: 'https://www.linkedin.com/in/leandro-gonzalez-657078259/'
  },
  {
    id: 2,
    name: 'instagram',
    src: '/src/components/icons/instagram_icon.svg',
    url: 'https://www.instagram.com/'
  },
  {
    id: 3,
    name: 'github',
    src: '/src/components/icons/github_icon.svg',
    url: 'https://github.com/leanlag87'
  },
  { id: 4, name: 'curriculum', src: '/src/components/icons/cv_resume_icon.svg', url: '' }
]
const telefono = '+54 9 381-5509162'
</script>

<template>
  <section class="datos-personales">
    <div class="card">
      <h1>{{ title }}</h1>
      <h2>{{ description }}</h2>
      <p>{{ presentacion }}</p>
      <ul class="container-lista">
        <li v-for="red in redesSociales" :key="red.id">
          <a :href="red.url"><img class="icon-redsocial" :src="red.src" width="35rem" :alt="red.name" /></a>
        </li>
      </ul>
      <h3>☎ Mi telefono personal: {{ telefono }}</h3>
      <h4>{{ residencia }}</h4>
    </div>
  </section>
</template>

<style scoped>
h1 {
  font-size: 2.5rem;
  color: rgb(26, 26, 26);
}

p {
  font-size: 1.2rem;
  font-weight: 600;
  margin-bottom: 1rem;
  color: rgb(26, 26, 26);
}

.card {
  background-color: rgb(66, 184, 131);
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
  background-color: aliceblue;
  border-radius: 50%;
  padding: 2px;
  margin: 5px;
  box-shadow: 0 0 5px rgba(95, 124, 205, 0.934);
}

.icon-redsocial:hover {
  background-color: black;
  box-shadow: 0 0 5px rgba(251, 249, 249, 0.934);
}

h3 {
  font-size: 1.2rem;
  font-weight: 600;
  color: rgb(26, 26, 26);
}

h2 {
  font-size: 1.5rem;
  font-weight: 600;
  color: rgb(26, 26, 26);
}

h4 {
  font-size: 1rem;
  font-weight: 600;
  color: rgb(26, 26, 26);
}
</style>
