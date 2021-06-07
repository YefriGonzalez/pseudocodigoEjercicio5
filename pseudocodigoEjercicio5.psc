Algoritmo Ejercicio5
	mujeresMayores=0
	hombresMenores=0
	Escribir "Ingrese el numero de personas que ingresara"
	Leer num
	Para i=1 Hasta num Hacer
		Escribir "Ingrese la edad"
		Leer edad
		Escribir "Ingrese el sexo, Masculino=M, Femenino=F"
		Leer sexo
		Escribir "Persona Registrada"
		si sexo="m" o sexo="M" Entonces
			si edad<18 Entonces
				hombresMenores=hombresMenores+1
			FinSi
		SiNo
			si sexo="F" o sexo="f" Entonces
				si edad>=18 Entonces
					mujeresMayores=mujeresMayores+1
				FinSi
			SiNo
				Escribir "Error al escribir el Sexo"
			FinSi
		FinSi
	FinPara
	Escribir "Cantidad de hombres Menores: " hombresMenores
	Escribir "Cantidad de mujeres Mayores: " mujeresMayores
FinAlgoritmo
