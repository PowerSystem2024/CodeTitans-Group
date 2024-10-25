<script setup></script>

<template>
  <div class="skills-contenedor">
    <div class="skills-categoria">
      <h3>Lenguajes de Programacion</h3>
      <ul class="skills">
        <li class="skill">
          <img src="/src/components/icons/python.svg" alt="python" />
          <span>Python: Avanzado</span>
        </li>
        <li class="skill">
          <img src="/src/components/icons/swift.svg" alt="python" />
          <span>Swift: Intermedio</span>
        </li>
        <li class="skill">
          <img src="/src/components/icons/database.svg" alt="python" />
          <span>SQL: Intermedio</span>
        </li>
        <li class="skill">
          <img src="/src/components/icons/dart.svg" alt="python" />
          <span>Dart: Intermedio</span>
        </li>
        <li class="skill">
          <img src="/src/components/icons/JS.svg" alt="python" />
          <span>Javascript: Intermedio</span>
        </li>
        <li class="skill">
          <img src="/src/components/icons/java.svg" alt="python" />
          <span>Java: Basico</span>
        </li>
      </ul>
    </div>
    <div class="skills-categoria">
      <h3>Frameworks</h3>
      <ul class="skills">
        <li class="skill">
          <img src="/src/components/icons/swift.svg" alt="python" />
          <span>SwiftUI: Intermedio</span>
        </li>
        <li class="skill">
          <img src="/src/components/icons/swift.svg" alt="python" />
          <span>UIKIT: Intermedio</span>
        </li>
        <li class="skill">
          <img src="/src/components/icons/flutter.svg" alt="python" />
          <span>Flutter: Intermedio</span>
        </li>
        <li class="skill">
          <img src="/src/components/icons/numpy.svg" alt="python" />
          <span>Numpy: Avanzado</span>
        </li>
        <li class="skill">
          <img src="/src/components/icons/pandas.svg" alt="python" />
          <span>Pandas: Avanzado</span>
        </li>
        <li class="skill">
          <img src="/src/components/icons/mysql.svg" alt="python" />
          <span>MySQL: Intermedio</span>
        </li>
        <li class="skill">
          <img src="/src/components/icons/postgresql.svg" alt="python" />
          <span>PostgreSQL: Intermedio</span>
        </li>
        <li class="skill">
          <img src="/src/components/icons/vue.svg" alt="python" />
          <span>Vue: Basico</span>
        </li>
      </ul>
    </div>
    <div class="skills-categoria">
      <h3>Idiomas</h3>
      <ul class="skills">
        <li class="skill">
          <img src="/src/components/icons/espaniol.svg" alt="python" />
          <span>Español: Nativo</span>
        </li>
        <li class="skill">
          <img src="/src/components/icons/english.svg" alt="python" />
          <span>Ingles: Avanzado</span>
        </li>
        <li class="skill">
          <img src="/src/components/icons/italian.svg" alt="python" />
          <span>Italiano: Intermedio</span>
        </li>
        <li class="skill">
          <img src="/src/components/icons/portuguese.svg" alt="python" />
          <span>Portugues: Basico</span>
        </li>
      </ul>
    </div>
  </div>
</template>

<!-- <style scoped>
.skills-contenedor {
  padding: 2rem;
  background-color: rgb(26, 26, 26);
  filter: drop-shadow(1px 1px 5px var(--vt-c-indigo));
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
  color: aliceblue;
  font-weight: bold;
}

.skills {
  display: flex;
  justify-content: space-evenly;
  flex-wrap: wrap;
  gap: 20px;
}

.skill {
  display: flex;
  justify-content: center;
  align-items: center;
  gap: 10px;
  background-color: rgba(241, 245, 243, 0.856);
  padding: 0.3em;
  border-radius: 8px;
  box-shadow: 0px 4px 12px rgba(2, 151, 151, 0.963);
  flex: 1 1 200px;
  max-width: 250px;
}
</style> -->
<style scoped>
.skills-contenedor {
  padding: 2rem;
  background-color: rgb(26, 26, 26);
  filter: drop-shadow(1px 1px 5px var(--vt-c-indigo));
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
  color: aliceblue;
  font-size: 1.5em;
  font-weight: bold;
}

.skills {
  display: flex;
  justify-content: space-evenly;
  flex-wrap: wrap;
  gap: 20px;
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
  background-color: rgba(148, 148, 148, 0.856);
  font-size: 1.1em;
  transition: 1s ease-out;
  color: #fff;
}

.skill img {
  width: 35px;
  height: 35px;
}

.skill span {
  font-size: 1em;
  color: #cccccc;
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
