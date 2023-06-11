<script>
  export let customer;
  export let name;
  export let birthDate;
  export let telNumber;
  export let date;
  export let email;
  export let startDate;
  export let renovationDate;
  export let billingDate;
  export let endDate;
  export let paymentDate;
  export let subscriptionType

    </script>
    
    
    
    <main>
        <table>
            <thead>
                <tr>
                  <th><img src={customer}></th>
                  <th></th><!-- Espacio vacío -->
                  <th>{name}</th>
                  <th>{telNumber}</th>
                  <th>{date}</th>
                  <th>{email}</th>
                </tr>
              </thead>
            
        </table>
    
    </main>