<script>
    import Servicios from "./lib/servicios.svelte";
    import logo from "./assets/imagenes/logo.png";
    import MainText from "./lib/Cover.svelte";
    import {Router, Link, Route} from "svelte-routing";
    import Login from "./lib/login.svelte";
    import Clientes from "./lib/Clientes.svelte";
    import Tarifas from "./lib/Tarifas.svelte";
    import {onMount} from "svelte";
    import image1 from "../assets/imagenes/footer/facebook.png"
    import image2 from "../assets/imagenes/footer/email.png"
    import image3 from "../asets/imagenes/footer/instagram.png"
    import image4 from "../assets/imagenes/footer/image1.png"
    


    onMount(() => {
        fetch("http://localhost:8080/clientes")
            .then(respuesta => respuesta.json())
            .then(datos => Clientes = datos)
    })

    import Carousel from "./lib/Carousel.svelte";
   

    
</script>

<main>
    <Router>
        <header>
            <img src={logo} alt="logo"/>
            <nav>
                <span><Link to="/">Inicio</Link></span>
                <span><Link to="/tarifas">Tarifas</Link></span>
                <span><Link to="/login">Login</Link></span>
            </nav>
        </header>
        <Route path="/">
           
            <MainText/>
            <Carousel/>
            <Servicios/>
           
           
           
        </Route>
        <Route path="/login">
            <Login/>
        </Route>
        <Route path="/servicios">
            <Clientes/>
        </Route>
  
    <Route path="/tarifas">
        <Tarifas/>
    </Route>
    </Router>
    
    
    
    <footer>
        <div class="footer">
            <p>Mobile app</p>
            <p>Comunidad</p>
            <img src={logo} alt="logo"/>
            <p>Blog</p>
            <p>Recursos</p>
            
        </div>
    
        <div class="footer-botom">
            <img src="../src/assets/imagenes/footer/facebook.png" alt="">
            <img src="../src/assets/imagenes/footer/email.png" alt="">
            <img src="../src/assets/imagenes/footer/instagram.png" alt="">
            <img src="../src/assets/imagenes/footer/image1.png" alt="">
            
        </div>
        </footer>
    


</main>


<style>
    header {
        width: 100%;
        display: flex;
        justify-content: space-between;
        align-items: center;
        background-color: #0bcbf6;
        padding-left: 50px;
        padding-right: 50px;


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

    
    p {
        font-size: xx-small;
    }
    .footer {
       
        display: flex;
        flex-direction: row;
        justify-content: space-between;
        align-items: center;
        width: 100%;
        padding: 55px;

    }

     .footer-botom{8
        border-top: 1px solid #000;
        display: flex;
        flex-direction: row;
        align-items:center
        
     }
    img{
        width: 10px;
    }
</style>
