<script setup>
import { ref } from 'vue';

const educacion = ref([
  {
    id: 1,
    fecha: "Mayo 2024",
    descripcion: "Adquirimos los conocimientos en Fundamentos de programacion en pseudocodigo utilizando Pseint",
  },
  {
    id: 2,
    fecha: "Abril 2024",
    descripcion: "Comenzamos con los lenguajes de programacion Java - Javascript - Python  y manejo de GitHub y GitBash",
  },
  {
    id: 3,
    fecha: "Julio 2024",
    descripcion: "Desarrollamos un CRUD para el proyecto integrador de Programacion I en Pseint",
  },
  {
    id: 4,
    fecha: "Septiembre 2024",
    descripcion: "Introduccion a POO con Java - JavaScript - Python",
  },
  {
    id: 5,
    fecha: "Noviembre 2024",
    descripcion: "Desarrollamos un CRUD en Java para el proyecto integrador de Programacion II",
  },

]);
</script>


<template>
  <div class="timeline">
    <div v-for="item in educacion" :key="item.id" class="card">
      <div class="info">
        <h3 class="title">{{ item.fecha }}</h3>
        <p>{{ item.descripcion }}</p>
      </div>
    </div>
  </div>
</template>

<style scoped>
:root {
  --primary-color: #212121;
  --background-color: #111;
  --font: sans-serif;
}

* {
  margin: 0;
  padding: 0;
}

body {
  background: var(--background-color);
  font-family: var(--font);
  display: flex;
  justify-content: center;
}

/* Timeline Container */
.timeline {
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  width: 95%;
  height: 100%;
  background-color: azure;
  border-radius: 10px;
  padding: 20px;
  margin: 1rem auto;
  box-shadow: 0 0 10px var(--vt-c-indigo);
  background-size: 400% 400%;
  border: 1px solid rgba(71, 71, 71, 0.521);
  cursor: pointer;
}

/* Card container */
.card {
  position: relative;
  max-width: 400px;
}

/* setting padding based on even or odd */
.card:nth-child(odd) {
  padding: 30px 0 30px 30px;
}

.card:nth-child(even) {
  padding: 30px 30px 30px 0;
}

/* Global ::before */
.card::before {
  content: "";
  position: absolute;
  width: 50%;
  border: solid rgb(167, 199, 218);

}

/* Setting the border of top, bottom, left */
.card:nth-child(odd)::before {
  left: 0px;
  top: -4.5px;
  bottom: -4.5px;
  border-width: 5px 0 5px 5px;
  border-radius: 50px 0 0 50px;
}

/* Setting the top and bottom to "-5px" because earlier it was out of a pixel in mobile devices */
@media only screen and (max-width: 400px) {
  .card:nth-child(odd)::before {
    top: -5px;
    bottom: -5px;
  }
}

/* Setting the border of top, bottom, right */
.card:nth-child(even)::before {
  right: 0;
  top: 0;
  bottom: 0;
  border-width: 5px 5px 5px 0;
  border-radius: 0 50px 50px 0;
}

/* Removing the border if it is the first card */
.card:first-child::before {
  border-top: 0;
  border-top-left-radius: 0;
}

/* Removing the border if it is the last card  and it's odd */
.card:last-child:nth-child(odd)::before {
  border-bottom: 0;
  border-bottom-left-radius: 0;
}

/* Removing the border if it is the last card  and it's even */
.card:last-child:nth-child(even)::before {
  border-bottom: 0;
  border-bottom-right-radius: 0;
}

/* Information about the timeline */
.info {
  display: flex;
  flex-direction: column;
  background: #daeeee;
  color: rgb(0, 0, 0);
  border-radius: 10px;
  padding: 10px;
  border: 1px solid rgba(71, 71, 71, 0.521);
  filter: drop-shadow(1px 1px 5px var(--vt-c-indigo));
}

/* Title of the card */
.title {
  color: rgb(16, 62, 77);
  position: relative;
}

/* Timeline dot  */
.title::before {
  content: "";
  position: absolute;
  width: 10px;
  height: 10px;
  background: white;
  border-radius: 999px;
  border: 3px solid rgb(93, 162, 179);
}

/* text right if the card is even  */
.card:nth-child(even)>.info>.title {
  text-align: right;
}

/* setting dot to the left if the card is odd */
.card:nth-child(odd)>.info>.title::before {
  left: -45px;
}

/* setting dot to the right if the card is odd */
.card:nth-child(even)>.info>.title::before {
  right: -45px;
}
</style>