package DesignPattern.Factory.solution2;

public class LeetCodeCompiler implements ICompiler{


    PythonCompiler pc = new PythonCompiler();
    JavaCompiler jc = new JavaCompiler();
    CppCompiler cc =  new CppCompiler();

    //better code is to not create object if not needed at all
    // saves memory of creating this objects
    

    @Override
    public void compile(final String code, final String language) {
        if(language.equalsIgnoreCase("JAVA")) {
            jc.compilewithJava(code);
        } else if(language.equalsIgnoreCase("PYTHON")) {
            pc.compilewithPython(code);
        } else if(language.equalsIgnoreCase("CPP")) {
            cc.compilewithCpp(code);
        } else {
            System.out.println("Language is not supported by compiler");
        }
    }

    public void compilev2(final String code, final String language) {
        if(language.equalsIgnoreCase("JAVA")) {
            new JavaCompiler().compilewithJava(code);
        } else if(language.equalsIgnoreCase("PYTHON")) {
            new PythonCompiler().compilewithPython(code);
        } else if(language.equalsIgnoreCase("CPP")) {
            new CppCompiler().compilewithCpp(code);
        } else {
            System.out.println("Language is not supported by compiler");
        }
    }


}
