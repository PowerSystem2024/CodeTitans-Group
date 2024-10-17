<script setup>//componente de habilidades
import { ref } from 'vue' // Importamos ref de vue para crear una referencia reactiva

const habilidades = ref([
    {
        id: 1,
        nombre: 'Leanguajes de Programacion',
        habilidades: [
            {
                id: 1,
                nombre: 'HTML',
                nivel: 'Intermedio',
                icono: '/src/components/icons/html.svg',
            },
            {
                id: 2,
                nombre: 'CSS',
                nivel: 'Intermedio',
                icono: '/src/components/icons/css.svg',
            },
            {
                id: 3,
                nombre: 'JavaScript',
                nivel: 'Intermedio',
                icono: '/src/components/icons/js.svg',
            },
            {
                id: 4,
                nombre: 'Java',
                nivel: 'Basico',
                icono: '/src/components/icons/java.svg',
            },
            {
                id: 5,
                nombre: 'Python',
                nivel: 'Basico',
                icono: '/src/components/icons/python.svg',
            },
        ]
    },
    {
        id: 2,
        nombre: 'Frameworks y Librerias',
        habilidades: [
            {
                id: 1,
                nombre: 'Vue.js',
                nivel: 'Intermedio',
                icono: '/src/components/icons/vue.svg',
            },
            {
                id: 2,
                nombre: 'React.js',
                nivel: 'Intermedio',
                icono: '/src/components/icons/react.svg',
            },
            {
                id: 3,
                nombre: 'Node.js',
                nivel: 'Intermedio',
                icono: '/src/components/icons/node.svg',
            },
            {
                id: 4,
                nombre: 'Express.js',
                nivel: 'Intermedio',
                icono: '/src/components/icons/express.svg',
            },
            {
                id: 5,
                nombre: 'Bootstrap',
                nivel: 'Intermedio',
                icono: '/src/components/icons/bootstrap.svg',
            },
        ]
    },
    {
        id: 3,
        nombre: 'Bases de Datos',
        habilidades: [
            {
                id: 1,
                nombre: 'MongoDB',
                nivel: 'Intermedio',
                icono: '/src/components/icons/mongo.svg',
            },
            {
                id: 2,
                nombre: 'SQL',
                nivel: 'Basico',
                icono: '/src/components/icons/mysql.svg',
            },
        ]
    },
    {
        id: 4,
        nombre: 'Herramientas y Software',
        habilidades: [
            {
                id: 1,
                nombre: 'Git',
                nivel: 'Intermedio',
                icono: '/src/components/icons/git.svg',
            },
            {
                id: 2,
                nombre: 'GitHub',
                nivel: 'Intermedio',
                icono: '/src/components/icons/github_icon.svg',
            },
            {
                id: 3,
                nombre: 'Visual Studio Code',
                nivel: 'Intermedio',
                icono: '/src/components/icons/vscode.svg',
            },
        ]
    },
    {
        id: 5,
        nombre: 'Idiomas',
        habilidades: [
            {
                id: 1,
                nombre: 'Español',
                nivel: 'Nativo',
                icono: '/src/components/icons/arg.svg',
            },
            {
                id: 2,
                nombre: 'Ingles',
                nivel: 'basico',
                icono: '/src/components/icons/usa.svg',
            },
        ]
    },

])
</script>

<template>
    <div class="skills-contenedor">
        <div v-for="habilidad in habilidades" :key="habilidad.id" class="skills-categoria">
            <h3>{{ habilidad.nombre }}</h3>
            <ul class="skills">
                <li v-for="habilidad in habilidad.habilidades" :key="habilidad.id" class="skill">
                    <img :src="habilidad.icono" :alt="habilidad.nombre" />
                    <span>{{ habilidad.nombre }}: {{ habilidad.nivel }}</span>

                </li>
            </ul>
        </div>

    </div>

</template>

<style scoped>
.skills-contenedor {
    display: flex;
    flex-wrap: wrap;
    justify-content: space-around;
    margin-top: 2rem;
}

.skills-categoria {
    width: 300px;
    margin: 1rem;
    padding: 1rem;
    border-radius: 5px;
    background-color: rgb(26, 26, 26);
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    filter: drop-shadow(1px 1px 5px rgb(66, 184, 131));
    cursor: pointer;
}

.skills-categoria h3 {
    color: azure;
    text-align: center;
}

.skills {
    list-style: none;
    padding: 0;
}

.skill {
    display: flex;
    align-items: center;
    gap: 10px;
    margin: 10px 0;
}

.skill img {
    width: 30px;
    height: 30px;
}

.skill span {
    color: azure;
}
</style>
