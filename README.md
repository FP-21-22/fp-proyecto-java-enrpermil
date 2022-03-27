# Proyecto del Segundo Cuatrimestre Fundamentos de Programación (Curso  21/22)
Autor/a: Enrique Pérez Milla   uvus:enrpermil


## Estructura de las carpetas del proyecto

* **/src**: Contiene los diferentes archivos que forman parte del proyecto. Debe estar estructurado en los siguentes paquetes
  * **fp.clinico**: Paquete que contiene los tipos del proyecto.
  * **fp.clinico.test**: Paquete que contiene las clases de test del proyecto.
  * **fp.vacunas**: Paquete que contiene un tipo Vacunación
  * **fp.utiles**:  Paquete que contiene las clases de utilidad. 
* **/data**: Contiene el dataset o datasets del proyecto
* **/doc**: Contiene la documentación del proyecto.
    
## Estructura del *dataset*



## Tipos implementados

### Tipo Persona


**Propiedades**:

- nombre, de tipo String, consultable. 
- apellidos, de tipo String, consultable. 
- dni, de tipo String, consultable. 
- fechaNacimiento, de tipo LocalDate, consultable.
- edad, de tipo Integer, derivada y consultable.
**Constructores**: 

- Implícitos en el tipo Record
**Restricciones**:
 
- R1: Fecha de nacimiento debe ser anterior a la fecha actual.
- R2: DNI debe ser cadena de 8 dígitos seguidos de una letra.

**Criterio de igualdad**: Por defecto asociado al Record.

**Criterio de ordenación**: Ordenar por el DNI (Compare to)

**Otras operaciones**:
 
- Método static of: recibe nombre, apellidos, dni y fecha de nacimiento y devuelve una persona.
- Método static parse: Recibe una cadena con un formato específico y devuelve una persona. 

### Tipo Paciente


**Propiedades**:

- persona, de tipo Persona, consultable. 
- codIngreso, de tipo String, consultable. 
- fechahora, de tipo LocalDateTime, consultable. 
- fechaIngreso, de tipo LocalDate, derivada y consultable.
- horaIngreso, de tipo String, derivada y consultable.
**Constructores**: 

- Implícitos en el tipo Record
**Restricciones**:
 
- R1: Fecha y hora de ingreso debe ser anterior o igual a la fecha actual.

**Criterio de igualdad**: Por defecto asociado al Record.

**Otras operaciones**:
 
- Método static of: recibe nombre, apellidos, dni, fecha de nacimiento, código y fecha y hora de
ingreso y devuelve un paciente. 

- Método static of: Recibe una cadena con un formato específico y devuelve una persona.
- Método static of: recibe un objeto persona, un código y una fecha y hora de ingreso y devuelve
un paciente. 

### Tipo PacienteEstudio


**Propiedades**:

- id, de tipo String, consultable.
- genero, de tipo String, consultable.
- edad, de tipo Double, consultable.
- hipertensión, de tipo Boolean, consultable.
- enfermedadCorazon, de tipo Boolean, consultable.
- tipoResidencia, enumerado TipoResidencia, consultable.
- nivelMedioGlucosa, de tipo Double, consultable.
- factor de riesgo, de tipo Boolean, derivada y consultable.

**Constructores**: 

- Implícitos en el tipo Record
**Restricciones**:
 
- R1: La edad tiene que estar entre 0 y 130
- R2: Nivel medio de glucosa mayor o igual a cero.

**Criterio de igualdad**: Por defecto asociado al Record.
**Criterio de orden**: Ordenación según la edad, y en caso de ser la misma, según el dni.

**Otras operaciones**:
 
- Método static of: recibe valores para cada propiedad básica y devuelve un objeto del tipo

- Método static of: recibe una cadena con un formato especificado y y devuelve un objeto del
tipo

### Tipo Vacunacion


**Propiedades**:

- fecha, de tipo LocalDate, consultable.
- comunidad, de tipo String, consultable.
- pfizer, de tipo Integer, consultable.
- moderna, de tipo Integer, consultable.
- astrazeneca, de tipo Integer, consultable.
- janssen, de tipo Integer, consultable.
- numPersonas, de tipo Integer, consultable.
- numTotal, de tipo Integer, derivada y consultable.

**Constructores**: 

- Implícitos en el tipo Record

**Restricciones**:
 
- R1: La fecha de debe ser posterior al 01/02/2021

**Criterio de igualdad**: Por defecto asociado al Record.

**Criterio de orden**: Ordenación según la comunidad, y en caso de ser la misma, según la fecha.

**Otras operaciones**:
 
- Método static of: recibe valores para cada propiedad básica y devuelve un objeto del tipo

#### Tipos auxiliares
Tipo Enumerado cuyos posibles valores son RURAL y URBANO

### Factoría
Descripción breve de la factoría.

- _método 1_: Descripción del método 1.
-	_método 2_: Descripción del método 2.

### Tipo Contenedor

De momento no es necesario la implementación.

**Propiedades**:

- _propiedad1_, de tipo \<Tipo1\>, consultable. 
- _propiedad2_, de tipo \<Tipo2\>, consultable y modificable. 
- ...
- 
**Constructores**: 

- C1: Descripción del constructor 1.
- C2: Descripción del constructor 2.
- ...

**Restricciones**:
 
- R1: Descripción de la restricción 1.
- R2: Descripción de la restricción 2.
- ...
- 
**Criterio de igualdad**: Describir el criterio de igualdad

**Criterio de ordenación**: Describir el criterio de ordenación (si lo hay).

**Otras operaciones**:
 
-	_método 1_: Descripción del método 1.
- ...
