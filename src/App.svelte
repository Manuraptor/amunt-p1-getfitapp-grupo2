<script>
  import logo from "./assets/imagenes/logo.png";
  import MainText from "./components/MainText.svelte";
</script>

<main>
  <header>
    <img src={logo} alt="logo" />
    <nav>
      <span>Servicios</span>
      <span>Tarifas</span>
    </nav>
  </header>
</main>

<MainText />

<style>
  header {
    width: 100%;
    display: flex;
    justify-content: space-between;
    align-items: center;
    background-color: aqua;
  }
  nav {
    padding: 20px;

  }

  span{
    margin: 10px;
    font-style: bold;
  }
  img {
    width: 140px;
    margin-left: 20px;
  }
</style>
