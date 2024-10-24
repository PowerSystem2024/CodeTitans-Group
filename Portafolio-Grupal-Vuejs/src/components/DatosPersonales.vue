<script setup>
const title = 'CodeTitans - Datos Personales';
const description = 'Tecnicatura Universitaria en programación';
const residencia = 'Argentina';
const presentacion =
  'Hola, somos el grupo CodeTitans y estamos cursando la Tecnicatura Universitaria en programación en la UTN. Nos encontramos en Argentina. ¡Bienvenidos a nuestro portafolio grupal!';
const integrantes = [
    {   id: 1,
        nombre: "Leandro",
        apellido: "Gonzalez",
    
    },
    {
        id: 2,
        nombre: "Denis",
        apellido: "Taraboreli",
    },
    
];
const redesSociales = [
  {
    id: 1,
    name: 'LinkedIn',
    src: '/src/components/icons/linkedin_icon.svg',
    url: 'https://www.linkedin.com/in/leandro-gonzalez-4b4b2a1b3/',
  },
  {
    id: 2,
    src: '/src/components/icons/github_icon.svg',
    name: 'GitHub',
    url: 'https://github.com/leanlag87',
  },
  {
    id: 3,
    src: '/src/components/icons/cv_resume_icon.svg',
    name: 'curriculum',
    url: '',
  },
];
</script>

<template>
  <section class="datos-personales">
    <div class="card">
      <h1>{{ title }}</h1>
      <h2>{{ description }}</h2>
      <p>{{ presentacion }}</p>
      <ul class="integrantes">
        <h4>Integrantes:</h4>
        <li v-for="integrante in integrantes" :key="integrante.nombre">
          <p>{{ integrante.nombre }} {{ integrante.apellido }}</p>
        </li>
      </ul>
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

      <h4>{{ residencia }}</h4>
    </div>
  </section>
</template>

<style scoped>
.datos-personales {
  display: flex;
  justify-content: center;
  align-items: center;
  flex-direction: column;
  margin: 2rem;
}

.card {
  display: flex;
  justify-content: center;
  align-items: center;
  flex-direction: column;
  background-color: azure;
  border-radius: 10px;
  padding: 1rem;
  margin: 1rem;
  box-shadow: 0 0 10px var(--vt-c-indigo);
}

.container-lista {
  display: flex;
  justify-content: center;
  align-items: center;
  flex-direction: row;
  list-style: none;
  padding: 0;
}

.integrantes {
  display: flex;
  justify-content: center;
  align-items: center;
  flex-direction: column;
  list-style: none;
  padding: 0;
}

.icon-redsocial {
  margin: 0.5rem;
}

h1 {
  font-size: 2rem;
  color: #333;
}

h2 {
  font-size: 1.5rem;
  color: #333;
}

h4 {
  font-size: 1rem;
  color: #333;
}

p {
  font-size: 1rem;
  color: #333;
}
</style>
