package ejercicios

/*P02: Buscar el anteultimo elemento de una lista*/

object P02 extends App{
  
  /************************************************************************************************/
  //Ejemplo 1: Se obtiene el anteultimo elemento de la lista, pasando como argumento una lista generica [T]
   val lastGenerico:String = P02.lastGenerico(List("a", "b", "c", "d"));
  println(lastGenerico);
  
   //Ejemplo 2: Se obtiene el anteultimo elemento de la lista, pasando como argumento una lista generica [T] y usando function Init y Last
  val lastGenerico2:String = P02.lastGenerico2(List("a", "b", "c", "d"));
  println(lastGenerico2);
  
  //Ejemplo 3: Se obtiene el anteultimo elemento de la lista, usando Pattern Match y recursividad
  val lastAnteultimo:String = P02.lastAnteultimo(List("a", "b", "c", "d"));
  println(lastAnteultimo);
  
  /************************************************************************************************/
   
   
  
   //Funcion que obtiene el ultimo elemento de una lista de tipo generico
  def lastGenerico[T](list: List[T]): T = {
    
    var tam:Int = list.length;
    return list(tam-2);
    
  }
  
  //Funcion que obtiene el ultimo elemento de una lista de tipo generico
  def lastGenerico2[T](list:List[T]):T ={
    //Init devuelve todos los elementos excepto el ultimo
    list.init.last;
  }
  
 
  
  /*Patron match: Recorre elemento a elemento de una lista. Divide la lista en 2 ( head y tail)*/
  /*The double colon (::) is the cons operator; x represents the head of the list, and xs the tail*/
   /* El caracter _ funciona como un wildcard o comodin*/
  
  def lastAnteultimo[T](list: List[T]): T = list match {
    case x :: (_::Nil) => x
    case x :: (_::xs) => lastAnteultimo(xs)
    case _ => throw new NoSuchElementException("list is empty") 
    }
    
  
  
  
 
  
}