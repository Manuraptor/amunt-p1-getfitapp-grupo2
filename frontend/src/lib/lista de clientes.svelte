<script>
   
import  clientes from "./clientes.svelte";
    
</script> 


<div class="clientes">   
    
    <p>Cliente</p>
    <p>Telefono</p>
    <p>Fecha de nacimiento</p>
    <p>Email</p>
    </div>
  
  <Cliente name="Nelly Dominguez/Av/Diagonal 124" telefono="698675345" fecha de nacimiento="18/09/1983" email="nelly.dom@gmail.com"/>
  

  <style>
    .clientes{
        display: flex;
      flex-direction: column;
      justify-content: space-between;
    } 

    p{
        font-weight:  400;
            
    }




  </style>