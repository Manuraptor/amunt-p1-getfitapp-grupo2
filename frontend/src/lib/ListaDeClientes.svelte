
        <script>

        import image1 from "../assets/imagenes/clientes/persona1.jpeg"
        import image2 from "../assets/imagenes/clientes/persona2.jpeg"
        import image3 from "../assets/imagenes/clientes/persona3.jpeg"
        import Clientes from "./Clientes.svelte"

        </script> 
        
       
        <main>
                  
        
            <table>
                <thead>
                  <tr>
                    <th>Cliente</th>
                    <th></th><!-- Espacio vacío -->
                    <th>Teléfono</th>
                    <th>Fecha de nacimiento</th>
                    <th>Email</th>
                  </tr>
                </thead>
                <tbody>

                    <Clientes customer={image1} 
                              name="Nelly Dominguez Av/Diagonal 124" 
                              telNumber="698675345" date="18/09/1983" 
                              email="nelly.dom@gmail.com"/>

                    <Clientes customer={image2} 
                              name="Manuel Rodrigues C/Valencia 45" 
                              telNumber="678125436" date="01/12/1995" 
                              email="manu.rod@gmail.com"/>

                    <Clientes customer={image3} 
                              name="Federico Martinez C/Mallorca 226" 
                              telNumber="695456098" 
                              date="25/07/1985" 
                              email="fed.martm@gmail.com"/>
                              
                              </tbody>
                </table>
             
        </main>
        
          <style>
        
            table{
               display: flex;
              flex-direction: column;
              justify-content: space-between;
              align-items: center;
            } 
        
            
          </style>
