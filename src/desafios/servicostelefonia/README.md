## Entrada
A entrada deve receber duas linhas. A primeira linha contém o nome do serviço a ser verificado (por exemplo, "movel", "fixa", "banda larga", "tv"). A segunda linha contém o nome do cliente seguido pelos serviços que ele contratou, todos separados por vírgulas (por exemplo, "Alice,movel,fixa").


## Saída
Deverá retornar "Sim" se o cliente contratou o serviço e "Nao" caso contrário.


## Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.


<table>
  <thead>
    <tr align="left">
      <th>Entrada</th>
      <th>Saída</th>
    </tr>
  </thead>
  <tbody align="left">
    <tr>
      <td>
        <br>movel<br>
        Alice,movel,fixa</td>
      <td>Sim</td>
    </tr>
    <tr>
      <td>
        <br>fixa<br>
        Bob,movel,TV</td>
      <td>Nao</td>
    </tr>
    <tr>
      <td>
        <br>tv<br>
        Carol,movel,fixa,tv	</td>
      <td>Sim</td>
    </tr>
    

  </tbody>
</table>