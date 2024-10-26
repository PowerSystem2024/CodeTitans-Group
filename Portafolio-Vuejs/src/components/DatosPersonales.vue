<script setup>
const title = "Denis Taraboreli";
const descripcion = "Tecnico universitario en Programacion - UTN";
const residencia="Pergamino, Buenos Aires, Argentina";
const presentacion = "Hola, Bienvenido a mi portafolio de proyectos. Soy desarrollador web con experiencia en el desarrollo de aplicaciones web  y mobiles";
const redesSociales = [
    {id: 1, name: 'linkedin', src: 'src/assets/linkedin_icon.svg', url: ''},
    {id: 2, name: 'GitHub', src: 'src/assets/github_icon.svg', url: ''},
    {id: 3, name: 'Cullicum vitae', src: 'src/assets/cv_resume_icon.svg', url: ''}
];
const telefono = "+54 9 2477-380932"
</script>

<template>
<section class="datos-personales">
    <div class="card">
        <h1>{{title}}</h1>
        <h2>{{ descripcion }}</h2>
        <P>{{ presentacion }}</P>
        <ul class="container-lista">
                <li v-for="red in redesSociales" :key="red.id">
                    <a :href="red.url"><img class="icon-redsocial" :src="red.src" width="35rem" :alt="red.name" /></a>
                </li>
            </ul>
        <h3> Mi telefono personal: {{ telefono }}</h3>
        <h4> {{residencia}}</h4>
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
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

.container-lista {
    display: flex;
    justify-content: center;
    align-items: center;
    flex-direction: row;
    list-style: none;
    padding: 0;
}

.intagrantes {
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