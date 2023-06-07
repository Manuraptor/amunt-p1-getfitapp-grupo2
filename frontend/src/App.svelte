<script>
    // @ts-nocheck

    import Servicios from "./lib/servicios.svelte";
    import logo from "./assets/imagenes/logo.png";
    import MainText from "./lib/Cover.svelte";

    import { Router, Link, Route } from "svelte-routing";

    import Login from "./lib/login.svelte";

</script>

<main>
    <Router>
        <header>
            <img src={logo} alt="logo" />
            <nav>
                <span>Servicios</span>
                <span>Tarifas</span>
                <span>Login</span>
            </nav>
        </header>
        <MainText />

        <Servicios />
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
