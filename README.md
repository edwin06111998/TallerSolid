# TallerSolid

-LITERAL 1:
Viola el principio Abierto/Cerrado puesto que las clases son muy similares, al crear la clase padre Postre, la clase Helado y Pastel extienden de la clase padre Postre.
- Literal 2:
viola el open closed principal , por que los metodos para las 2 claes (Pastel y helado) si queremos agregar o quitar aderezo y  poner un nuevo postre, debemos implementar 2 metods nuevos para la clase a trabajar.

- literal 3:
viola single resposability principle, por que se encarga del manejo del prcion final y la presentacion que la hace por la clase show. por ende crea la clase manejo de precios para que tenga solo la responsabilidad del manejo de precios

- Literal 4:
En el proyecto se viola el principio Open/Closed debido a que la clase Enum Aderezo que esta en el paquete Adicionales solo existen 3 valores los cuales sirven para identficiar cada especie de aderezo pero al momento de añadir otro aderezo a parte de los que ya existen se debe modificar la clasa Aderezo, por lo que se creo una clase Abstracta Aderezo que pueden hederar otras clases lo cual permitiria agregar aderezos sin modificar ninguna clase del proyecto
