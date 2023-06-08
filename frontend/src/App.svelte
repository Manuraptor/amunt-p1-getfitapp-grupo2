<script>
  

    import Servicios from "./lib/servicios.svelte";
    import logo from "./assets/imagenes/logo.png";
    import MainText from "./lib/Cover.svelte";
    import {Router, Link, Route} from "svelte-routing";
    import Login from "./lib/login.svelte";
    import ListaDeClientes from "./lib/ListaDeClientes.svelte";

</script>

<main>
    <Router>
        <header>
            <img src={logo} alt="logo"/>
            <nav>
                <span><Link to="/">Inicio</Link></span>
                <span><Link to="/servicios">Servicios</Link></span>
                <span>Tarifas</span>
                <span><Link to="/login">Login</Link></span>
            </nav>
        </header>
        <Route path="/">
            <MainText/>
            <Servicios/>
        </Route>
        <Route path="/login">
            <Login />
          
        </Route>
        <Route path="/servicios">
            <ListaDeClientes />
        </Route>
    </Router>
</main>



<style>
    header {
        width: 100%;
        display: flex;
        justify-content: space-between;
        align-items: center;
        background-color: #0bcbf6;
    }

    nav {
        padding: 20px;
    }

    span {
        margin: 10px;
        font-weight: bold;
    }

    img {
        width: 140px;
        margin-left: 20px;
    }
</style>
