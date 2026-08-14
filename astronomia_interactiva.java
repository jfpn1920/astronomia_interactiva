import java.util.Scanner;
public class astronomia_interactiva {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] nombres = new String[10];
        String[] tipos = new String[10];
        double[] distancias = new double[10];
        double[] diametros = new double[10];
        String[] constelaciones = new String[10];
        String[] fechasObservacion = new String[10];
        String[] estados = new String[10];
        int total = 0;
        int opcion;
        //----------------------------------------------//
        //--|menu_principal_de_astronomia_interactiva|--//
        //----------------------------------------------//
        do {
            System.out.println("menu principal de astronomia interactiva");
            System.out.println("1) Registrar objeto astronomico");
            System.out.println("2) Editar objeto astronomico");
            System.out.println("3) Listar objetos astronomicos");
            System.out.println("4) Buscar objeto astronomico");
            System.out.println("5) Eliminar objeto astronomico");
            System.out.println("6) Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion) {
                //----------------------------------//
                //--|registrar_objeto_astronomico|--//
                //----------------------------------//
                case 1:
                    int id = total + 1;
                    System.out.println("registro del objeto astronomico");
                    System.out.println("id del objeto a registrar: " + id);
                    System.out.print("nombre del objeto: ");
                    nombres[total] = entrada.nextLine();
                    System.out.print("tipo de objeto: ");
                    tipos[total] = entrada.nextLine();
                    System.out.print("distancia aproximada en millones de km: ");
                    distancias[total] = entrada.nextDouble();
                    System.out.print("diametro en km: ");
                    diametros[total] = entrada.nextDouble();
                    entrada.nextLine();
                    System.out.print("constelacion: ");
                    constelaciones[total] = entrada.nextLine();
                    System.out.print("fecha de observacion: ");
                    fechasObservacion[total] = entrada.nextLine();
                    System.out.print("estado de observacion: ");
                    estados[total] = entrada.nextLine();
                    System.out.println("Objeto astronomico registrado correctamente.");
                    total++;
                    break;
                //-------------------------------//
                //--|editar_objeto_astronomico|--//
                //-------------------------------//
                case 2:
                    if (total == 0) {
                        System.out.println("No existen objetos astronomicos registrados.");
                        break;
                    }
                    System.out.println("Datos de los objetos astronomicos");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Nombre: " + nombres[i] + " | Tipo: " + tipos[i] + " | Distancia: " + distancias[i] + " millones km | Diametro: " + diametros[i] + " km | Constelacion: " + constelaciones[i] + " | Observacion: " + fechasObservacion[i] + " | Estado: " + estados[i]);
                    }
                    System.out.print("Ingrese el ID del objeto astronomico: ");
                    int idBuscar = entrada.nextInt();
                    entrada.nextLine();
                    if (idBuscar >= 1 && idBuscar <= total) {
                        int posicion = idBuscar - 1;
                        System.out.println("Editar el dato del objeto astronomico");
                        System.out.print("Nuevo nombre del objeto: ");
                        nombres[posicion] = entrada.nextLine();
                        System.out.print("Nuevo tipo de objeto: ");
                        tipos[posicion] = entrada.nextLine();
                        System.out.print("Nueva distancia aproximada en millones de km: ");
                        distancias[posicion] = entrada.nextDouble();
                        System.out.print("Nuevo diametro en km: ");
                        diametros[posicion] = entrada.nextDouble();
                        entrada.nextLine();
                        System.out.print("Nueva constelacion: ");
                        constelaciones[posicion] = entrada.nextLine();
                        System.out.print("Nueva fecha de observacion: ");
                        fechasObservacion[posicion] = entrada.nextLine();
                        System.out.print("Nuevo estado de observacion: ");
                        estados[posicion] = entrada.nextLine();
                        System.out.println("Objeto astronomico actualizado correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //---------------------------------//
                //--|listar_objetos_astronomicos|--//
                //---------------------------------//
                case 3:
                    if (total == 0) {
                        System.out.println("No existen objetos astronomicos registrados.");
                    } else {
                        System.out.println("Lista de objetos astronomicos");
                        for (int i = 0; i < total; i++) {
                            System.out.println("ID: " + (i + 1) + " | Nombre: " + nombres[i] + " | Tipo: " + tipos[i] + " | Distancia: " + distancias[i] + " millones km | Diametro: " + diametros[i] + " km | Constelacion: " + constelaciones[i] + " | Observacion: " + fechasObservacion[i] + " | Estado: " + estados[i]);
                        }
                    }
                    break;
                //-------------------------------//
                //--|buscar_objeto_astronomico|--//
                //-------------------------------//
                case 4:
                    if (total == 0) {
                        System.out.println("No existen objetos astronomicos registrados.");
                        break;
                    }
                    System.out.println("busqueda de objeto astronomico");
                    System.out.print("ingresa la id para buscar objeto astronomico: ");
                    int idBusqueda = entrada.nextInt();
                    entrada.nextLine();
                    if (idBusqueda >= 1 && idBusqueda <= total) {
                        int posicion = idBusqueda - 1;
                        System.out.println("Datos del objeto astronomico encontrado:");
                        System.out.println("ID: " + idBusqueda + " | Nombre: " + nombres[posicion] + " | Tipo: " + tipos[posicion] + " | Distancia: " + distancias[posicion] + " millones km | Diametro: " + diametros[posicion] + " km | Constelacion: " + constelaciones[posicion] + " | Observacion: " + fechasObservacion[posicion] + " | Estado: " + estados[posicion]);
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //---------------------------------//
                //--|eliminar_objeto_astronomico|--//
                //---------------------------------//
                case 5:
                    if (total == 0) {
                        System.out.println("No existen objetos astronomicos registrados.");
                        break;
                    }
                    System.out.println("Datos de los objetos astronomicos");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Nombre: " + nombres[i] + " | Tipo: " + tipos[i] + " | Distancia: " + distancias[i] + " millones km | Diametro: " + diametros[i] + " km | Constelacion: " + constelaciones[i] + " | Observacion: " + fechasObservacion[i] + " | Estado: " + estados[i]);
                    }
                    System.out.print("Ingrese el ID del objeto astronomico a eliminar: ");
                    int idEliminar = entrada.nextInt();
                    entrada.nextLine();
                    if (idEliminar >= 1 && idEliminar <= total) {
                        int posicion = idEliminar - 1;
                        for (int i = posicion; i < total - 1; i++) {
                            nombres[i] = nombres[i + 1];
                            tipos[i] = tipos[i + 1];
                            distancias[i] = distancias[i + 1];
                            diametros[i] = diametros[i + 1];
                            constelaciones[i] = constelaciones[i + 1];
                            fechasObservacion[i] = fechasObservacion[i + 1];
                            estados[i] = estados[i + 1];
                        }
                        total--;
                        System.out.println("Objeto astronomico eliminado correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //------------------------------//
                //--|salir_del_menu_principal|--//
                //------------------------------//
                case 6:
                    System.out.println("Gracias por utilizar Astronomia Interactiva.");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 6);
        entrada.close();
    }
}