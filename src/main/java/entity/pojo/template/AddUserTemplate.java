package entity.pojo.template;

import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.Rule;
import br.com.six2six.fixturefactory.loader.TemplateLoader;
import entity.pojo.AddUser;

public class AddUserTemplate implements TemplateLoader {
    @Override
    public void load() {

        Rule rule = new Rule() {{
            add("UserRole", random("Admin", "ESS"));
            add("Status", random("Enabled", "Disabled"));
            add("EmpName", uniqueRandom("Shital", "malviya", "ranu"));
            add("userName", random("Shital", "malviya", "ranu"));

            add("password",random("fdfdsf","fdfdfds") );
            add("confirmPassword", random("sfsdfs","fdsfsf"));


        }};
        Fixture.of(AddUser.class).addTemplate("valid", rule);


    }
}
