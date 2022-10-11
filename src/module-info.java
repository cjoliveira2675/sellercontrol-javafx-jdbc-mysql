module SellerControl {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	requires java.sql;
	requires java.desktop;
	
	opens application to javafx.graphics, javafx.fxml;
	
	opens gui to javafx.graphics, javafx.fxml;
	opens model.entities to javafx.base;
}
