package Notas;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * Esta clase denominada VentanaPrincipal define una interfaz gr�fica que
 * permitir� crear un array de notas. Luego, se puede calcular el promedio de
 * notas, la desviaci�n, la nota mayor y la nota menor del array.
 *
 * @version 1.2/2020
 */
public class VentanaPrincipal extends JFrame implements
        ActionListener {
// Un contenedor de elementos gr�ficos

    private Container contenedor;
// Etiquetas est�ticas de cada nota
    private JLabel nota1, nota2, nota3, nota4, nota5, promedio,
            desviaci�n, mayor, menor;
// Campos de ingreso de cada nota
    private JTextField campoNota1, campoNota2, campoNota3,
            campoNota4, campoNota5;
// Botones para realizar c�lculos y para borrar las notas
    private JButton calcular, limpiar, salir;

    /**
     * Constructor de la clase VentanaPrincipal
     */
    public VentanaPrincipal() {
        inicio();
        setTitle("NOTAS"); // Establece el t�tulo de la ventana
        setSize(280, 400); // Establece el tama�o de la ventana
        setLocationRelativeTo(null);
        /* La ventana se posiciona en el
centro de la pantalla */
// Establece que el bot�n de cerrar permitir� salir de la aplicaci�n
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        /* Establece que el tama�o de la ventana no
se puede cambiar */
    }

    /**
     * M�todo que crea la ventana con sus diferentes componentes gr�ficos
     */
    private void inicio() {
        contenedor = getContentPane();
        contenedor.setBackground(Color.white);
        /* Obtiene el panel de
contenidos de la ventana */
        contenedor.setLayout(null);
        /* Establece que el contenedor no
tiene un layout */
// Establece la etiqueta y el campo de texto de la nota 1
        nota1 = new JLabel();
        nota1.setText("Nota 1:");
        nota1.setBounds(20, 20, 135, 23);
        /* Establece la posici�n de la
etiqueta nota 1 */
        campoNota1 = new JTextField();
// Establece la posici�n del campo de texto de la nota 1
        campoNota1.setBounds(105, 20, 135, 23);
// Establece la etiqueta y el campo de texto de la nota 2
        nota2 = new JLabel();
        nota2.setText("Nota 2:");
        nota2.setBounds(20, 50, 135, 23);
        /* Establece la posici�n de la
etiqueta nota 2 */
        campoNota2 = new JTextField();
// Establece la posici�n del campo de texto de la nota 2
        campoNota2.setBounds(105, 50, 135, 23);
// Establece la etiqueta y el campo de texto de la nota 3
        nota3 = new JLabel();
        nota3.setText("Nota 3:");
        nota3.setBounds(20, 80, 135, 23);
        /* Establece la posici�n de la
etiqueta nota 3*/
        campoNota3 = new JTextField();
// Establece la posici�n del campo de texto de la nota 3
        campoNota3.setBounds(105, 80, 135, 23);
// Establece la etiqueta y el campo de texto de la nota 4
        nota4 = new JLabel();
        nota4.setText("Nota 4:");
        nota4.setBounds(20, 110, 135, 23);
        /* Establece la posici�n de la
etiqueta nota 4 */
        campoNota4 = new JTextField();
// Establece la posici�n del campo de texto de la nota 4
        campoNota4.setBounds(105, 110, 135, 23);
// Establece la etiqueta y el campo de texto de la nota 5
        nota5 = new JLabel();
        nota5.setText("Nota 5:");
        nota5.setBounds(20, 140, 135, 23);
        /* Establece la posici�n de la
etiqueta nota 5 */
        campoNota5 = new JTextField();
// Establece la posici�n del campo de texto de la nota 5
        campoNota5.setBounds(105, 140, 135, 23);
// Establece el bot�n Calcular
        calcular = new JButton();
        calcular.setBackground(new Color(0,0,153));
        calcular.setForeground(Color.white);
        calcular.setText("Calcular");
        calcular.setBounds(40, 175, 100, 23);
        /* Establece la posici�n
del bot�n Calcular */
 /* Agrega al bot�n un ActionListener para que gestione eventos
del bot�n */
        calcular.addActionListener(this);
// Establece el bot�n Limpiar
        limpiar = new JButton();
        limpiar.setBackground(new Color(0,0,153));
        limpiar.setForeground(Color.white);
        limpiar.setText("Limpiar");
        limpiar.setBounds(145, 175, 80, 23);
        /* Establece la posici�n del
bot�n Limpiar */
 /* Agrega al bot�n un ActionListener para que gestione eventos
del bot�n */
        limpiar.addActionListener(this);
// Establece la etiqueta del promedio con su valor num�rico
        promedio = new JLabel();
        promedio.setText("Promedio = ");
        promedio.setBounds(20, 210, 135, 23);
        /* Establece la posici�n de la etiqueta promedio */
// Establece la etiqueta de la desviaci�n con su valor num�rico
        desviaci�n = new JLabel();
        desviaci�n.setText("Desviaci�n = ");
        desviaci�n.setBounds(20, 240, 200, 23);
        /* Establece la posici�n
de la etiqueta desviaci�n */
// Establece la etiqueta de la nota mayor con su valor num�rico
        mayor = new JLabel();
        mayor.setText("Nota mayor = ");
        mayor.setBounds(20, 270, 120, 23);
        /* Establece la posici�n de
la etiqueta nota mayor */
// Establece la etiqueta de la nota menor con su valor num�rico
        menor = new JLabel();
        menor.setText("Nota menor = ");
        menor.setBounds(20, 300, 120, 23);
        /* Establece la posici�n de
la etiquete nota menor */
// Se a�ade cada componente gr�fico al contenedor de la ventana
        salir = new JButton();
        salir.setBackground(new Color(0,0,153));
        salir.setForeground(Color.white);
        salir.setText("SALIR");
        salir.setBounds(90, 330, 100, 23);
        salir.addActionListener(this);
        

        contenedor.add(nota1);
        contenedor.add(campoNota1);
        contenedor.add(nota2);
        contenedor.add(campoNota2);
        contenedor.add(nota3);
        contenedor.add(campoNota3);
        contenedor.add(nota4);
        contenedor.add(campoNota4);
        contenedor.add(nota5);
        contenedor.add(campoNota5);
        contenedor.add(calcular);
        contenedor.add(limpiar);
        contenedor.add(promedio);
        contenedor.add(desviaci�n);
        contenedor.add(mayor);
        contenedor.add(menor);
        contenedor.add(salir);
    }

    /**
     * M�todo que gestiona los eventos generados en la ventana principal
     */
    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == calcular) {
            /* Si se pulsa el bot�n
Calcular */
            Notas notas = new Notas(); // Se crea un objeto Notas
// Se obtiene y convierte el valor num�rico de la nota 1
            notas.listaNotas[0] = Double.parseDouble(campoNota1.
                    getText());
// Se obtiene y convierte el valor num�rico de la nota 2
            notas.listaNotas[1] = Double.parseDouble(campoNota2.
                    getText());
// Se obtiene y convierte el valor num�rico de la nota 3
            notas.listaNotas[2] = Double.parseDouble(campoNota3.
                    getText());
// Se obtiene y convierte el valor num�rico de la nota 4
            notas.listaNotas[3] = Double.parseDouble(campoNota4.
                    getText());
// Se obtiene y convierte el valor num�rico de la nota 5
            notas.listaNotas[4] = Double.parseDouble(campoNota5.
                    getText());
            notas.calcularPromedio(); // Se calcula el promedio
            notas.calcularDesviaci�n(); // Se calcula la desviaci�n
// Se muestra el promedio formateado
            promedio.setText("Promedio = " + String.valueOf(String.
                    format("%.2f",
                            notas.calcularPromedio())));
            double desv = notas.calcularDesviaci�n();
// Se muestra la desviaci�n formateada
            desviaci�n.setText("Desviaci�n est�ndar = " + String.
                    format("%.2f", desv));
// Se muestra el valor mayor formateado
            mayor.setText("Valor mayor = " + String.valueOf(notas.
                    calcularMayor()));
// Se muestra el valor menor formateado
            menor.setText("Valor menor = " + String.valueOf(notas.
                    calcularMenor()));
        }
        /* Se se pulsa el bot�n Limpiar se dejan en blanco los campos de
notas */
        if (evento.getSource() == limpiar) {
            campoNota1.setText("");
            campoNota2.setText("");
            campoNota3.setText("");
            campoNota4.setText("");
            campoNota5.setText("");
        }
        if (evento.getSource() == salir) {
            dispose();
        }
    }
}
