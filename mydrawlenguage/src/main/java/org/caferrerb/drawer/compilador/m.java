package org.caferrerb.drawer.compilador;

public class m {

	public m() {
		// TODO Auto-generated constructor stub
	}
	
	 public static void main(String[] args) {
    	 String classNameA = "ExampleClass";
         String codeA =
        		 "import co.edu.eam.ingesoft.tlf.dibujador.utilidades.*;"+
             "public class ExampleClass {" + "\n" + 
             "    public static void exampleMethod(String name) {" + "\n" + 
             "        System.out.println(\"Hello, \"+name);Gestor" + "\n" + 
             "    }" + "\n" + 
             "}" + "\n";

         RuntimeCompiler r = new RuntimeCompiler();
         r.addClass(classNameA, codeA);
         r.compile();

         MethodInvocationUtils.invokeStaticMethod(
             r.getCompiledClass(classNameA), 
             "exampleMethod", "exampleParameter");
	}

}
