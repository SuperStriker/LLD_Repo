package DesignPattern.Factory.solution3;



public class LeetCodeCompiler implements ICompiler {

    @Override
    public void compile(final String code, final String language) {
        ILanguageCompiler languageCompiler = LanguageFactory.chooseCompiler(language);
        if(languageCompiler != null) {
            languageCompiler.compileWithLanguage(code);
        }
    }

}
