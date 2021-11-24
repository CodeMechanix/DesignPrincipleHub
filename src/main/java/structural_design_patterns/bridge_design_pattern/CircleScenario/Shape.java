package structural_design_patterns.bridge_design_pattern.CircleScenario;

public abstract class Shape {
    protected DrawApi drawApi;

    protected Shape(DrawApi drawApi) {
        this.drawApi = drawApi;
    }

    public abstract void draw();
}
