<script setup></script>

<template>
  <div class="skills-contenedor">
    <div class="skills-categoria">
      <h3>Lenguajes de Programacion</h3>
      <ul class="skills">
        <li class="skill">
          <img src="/src/components/icons/python.svg" alt="python" />
          <span>Python</span>
        </li>
        <li class="skill">
          <img src="/src/components/icons/JS.svg" alt="python" />
          <span>Javascript</span>
        </li>
        <li class="skill">
          <img src="/src/components/icons/java.svg" alt="python" />
          <span>Java</span>
        </li>
        <li class="skill">
          <img src="/src/components/icons/database.svg" alt="python" />
          <span>SQL</span>
        </li>
      </ul>
    </div>
    <div class="skills-categoria">
      <h3>Frameworks y Otros:</h3>
      <ul class="skills">
        <li class="skill">
          <img src="/src/components/icons/mysql.svg" alt="python" />
          <span>MySQL</span>
        </li>
        <li class="skill">
          <img src="/src/components/icons/git.svg" alt="python" />
          <span>Git</span>
        </li>
        <li class="skill">
          <img src="/src/components/icons/vue.svg" alt="python" />
          <span>Vue</span>
        </li>
        <li class="skill">
          <img src="/src/components/icons/uml.svg" alt="python" />
          <span>UML</span>
        </li>
      </ul>
    </div>
    <div class="skills-categoria">
      <h3>Idiomas</h3>
      <ul class="skills">
        <li class="skill">
          <img src="/src/components/icons/espaniol.svg" alt="python" />
          <span>Español</span>
        </li>
        <li class="skill">
          <img src="/src/components/icons/english.svg" alt="python" />
          <span>Ingles</span>
        </li>
      </ul>
    </div>
  </div>
</template>

<style scoped>
.skills-contenedor {
  padding: 2rem;
  background-color: azure;
  box-shadow: 0 0 10px var(--vt-c-indigo);
  border-radius: 15px;
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
