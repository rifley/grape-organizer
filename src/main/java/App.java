import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/grapeInput", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();

      ArrayList<Grape> grapes = request.session().attribute("grapes");
      if (grapes == null ){
        grapes = new ArrayList<Grape>();
        request.session().attribute("grapes", grapes);
      }

      String flavor = request.queryParams("flavor");
      String size = request.queryParams("size");
      int softness = Integer.parseInt(request.queryParams("softness"));
      String color = request.queryParams("color");
      String origin = request.queryParams("origin");
      Grape newGrape = new Grape(flavor, size, softness, color, origin);
      grapes.add(newGrape);

      // model.put("grape", newGrape);
      model.put("grapes", request.session().attribute("grapes"));
      model.put("template", "templates/grapeplains.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());


  }
}
