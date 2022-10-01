package com.ifpe.ts.testes.piramide;

import org.assertj.swing.edt.FailOnThreadViolationRepaintManager;
import org.assertj.swing.edt.GuiActionRunner;
import org.assertj.swing.fixture.FrameFixture;
import org.assertj.swing.fixture.JPanelFixture;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ifpe.view.Frame;



public class GUITest {

	private FrameFixture window;
	private JPanelFixture panel;


	@BeforeClass
	public static void setUpOnce() {
		FailOnThreadViolationRepaintManager.install();
	}
	
	@Before
	public void onSetUp() {
		Frame gui = GuiActionRunner.execute(() -> new Frame());
		window = new FrameFixture(gui);
		window.resizeWidthTo(500);
		window.resizeHeightTo(400);
		window.show();
	}

	@Test
	public void checkTitleTest() {
		window.show();
		window.requireTitle("IFEmpréstimo");
		
	}
	
	@After
	public void onTearDown() {
		window.cleanUp();
	}
	

}
