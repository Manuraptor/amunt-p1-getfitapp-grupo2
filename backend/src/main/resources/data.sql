insert into clientes(id, name, birth_date, id_card, tel_number, email, address, lopd_accepted, start_date,
                     renovation_date, billing_date, end_date, payment_type, subscription_type)
values (1, 'Nelly Dominguez', '18/09/1983', '34567854G', '698675345', 'nelly.dom@gmail.com',
        'Av/Diagonal 124, Barcelona', true, '12/05/2021', '23/12/2023', '05/07/2023', '23/12/2023', 'Efectivo',
        'Anual'),
       (2, 'Manuel Rodrígues', '01/12/1995', '323443256h', '6781254365', 'manu.rod@gmail.com',
        'C/Valencia 45, Barcelona', false, '16/05/2023', '16/08/2023', '05/07/2023', null, 'tarjeta', 'Trimestral'),
       (3, 'Federico Martínez', '24/11/1993', '45665478j', '695756098', 'fed.martm@gmail.com',
        'C/Mallorca 226, Barcelona', true, '08/10/2022', '08/10/2023', '05/07/2023', null, 'efectivo', 'Mensual');