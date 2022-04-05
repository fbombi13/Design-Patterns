import javax.swing.*;
import java.awt.*;
import java.util.Calendar;
import java.util.Date;

class CompSrchBuilder extends UIBuilder {

    private JTextField txtCompanyName = new JTextField(25);
    private JTextField txtTaxIdentificationNumber = new JTextField(20);
    private JTextField txtCountry = new JTextField(15);
    private JTextField txtAddress = new JTextField(30);

    public void addUIControls() {
        searchUI = new JPanel();
        JLabel lblCompanyName = new JLabel("Company Name :");
        JLabel lblTaxIdentificationNumber = new JLabel("Tax Identification Number:");
        JLabel lblCountry = new JLabel("Country :");
        JLabel lblAddress = new JLabel("Address :");

        GridBagLayout gridbag = new GridBagLayout();
        searchUI.setLayout(gridbag);
        GridBagConstraints gbc = new GridBagConstraints();
        searchUI.add(lblCompanyName);
        searchUI.add(txtCompanyName);
        searchUI.add(lblTaxIdentificationNumber);
        searchUI.add(txtTaxIdentificationNumber);
        searchUI.add(lblCountry);
        searchUI.add(txtCountry);
        searchUI.add(lblAddress);
        searchUI.add(txtAddress);

        gbc.anchor = GridBagConstraints.WEST;

        gbc.insets.top = 5;
        gbc.insets.bottom = 5;
        gbc.insets.left = 5;
        gbc.insets.right = 5;

        gbc.gridx = 0;
        gbc.gridy = 0;
        gridbag.setConstraints(lblCompanyName, gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;
        gridbag.setConstraints(lblTaxIdentificationNumber, gbc);
        gbc.gridx = 0;
        gbc.gridy = 2;
        gridbag.setConstraints(lblCountry, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gridbag.setConstraints(lblAddress, gbc);

        gbc.anchor = GridBagConstraints.WEST;
        gbc.gridx = 1;
        gbc.gridy = 0;
        gridbag.setConstraints(txtCompanyName, gbc);
        gbc.gridx = 1;
        gbc.gridy = 1;
        gridbag.setConstraints(txtTaxIdentificationNumber, gbc);
        gbc.gridx = 1;
        gbc.gridy = 2;
        gridbag.setConstraints(txtCountry, gbc);
        gbc.gridx = 1;
        gbc.gridy = 3;
        gridbag.setConstraints(txtAddress, gbc);
    }

    public void initialize() {
        txtCompanyName.setText("Enter Company Name Here");
        txtTaxIdentificationNumber.setText("Enter Tax Identification number Here");
        txtCountry.setText("Enter Country Here");
        txtAddress.setText("Enter Address Here");
    }

    public String getSQL() {
        return ("Select * from Company where CompanyName='" + txtCompanyName.getText() + "'" + " and TaxIdentificationNumber='" + txtTaxIdentificationNumber.getText() + "' and Country='" + txtCountry.getText() + "' and Address '" + txtAddress.getText() + "'");

    }

}
