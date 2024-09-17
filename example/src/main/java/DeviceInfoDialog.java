import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.stream.Stream;

public final class DeviceInfoDialog extends JDialog {
    public DeviceInfoDialog(List<DeviceInfo> deviceInfoList) {
        super((JFrame) null, "选择 Vulkan 设备", true);

        JPanel innerPane = new JPanel();
        GridBagLayout layout = new GridBagLayout();
        innerPane.setLayout(layout);

        JLabel deviceLabel = new JLabel("选择设备:");
        String[] deviceNameArray = Stream.concat(
                Stream.of("请选择"),
                deviceInfoList.stream().map(DeviceInfo::name)
        ).toArray(String[]::new);
        JComboBox<String> comboBox = new JComboBox<>(deviceNameArray);

        JTextArea detailTextArea = new JTextArea();
        UICommons.makeGrayBackgroundAndReadonly(detailTextArea);
        detailTextArea.setLineWrap(true);
        detailTextArea.setWrapStyleWord(true);
        detailTextArea.setFont(UICommons.defaultMonospaceFont);
        detailTextArea.setText("选择一个设备，然后这里会显示其具体细节");
        detailTextArea.setBorder(BorderFactory.createLineBorder(UIManager.getColor("MenuBar.borderColor"), 1));
        UICommons.createTextAreaMenu(detailTextArea);

        JScrollPane detailScrollPane = new JScrollPane(detailTextArea);

        JButton cancelButton = new JButton("取消");
        JButton okButton = new JButton("确定");
        okButton.setEnabled(false);

        comboBox.addActionListener(_ -> {
            int selectedIndex = comboBox.getSelectedIndex();
            if (selectedIndex == 0) {
                detailTextArea.setText("选择一个设备，然后这里会显示其具体细节");
                okButton.setEnabled(false);
            } else {
                detailTextArea.setText(deviceInfoList.get(selectedIndex - 1).details());
                okButton.setEnabled(true);
                detailTextArea.setCaretPosition(0);
            }
        });

        okButton.addActionListener(_ -> {
            this.selectedDeviceId = comboBox.getSelectedIndex() - 1;
            this.setVisible(false);
        });

        cancelButton.addActionListener(_ -> {
            this.selectedDeviceId = null;
            this.setVisible(false);
        });

        {
            GridBagConstraints deviceLabelConstraints = new GridBagConstraints();
            deviceLabelConstraints.gridx = 0;
            deviceLabelConstraints.gridy = 0;
            deviceLabelConstraints.weightx = 0;
            deviceLabelConstraints.weighty = 0;
            deviceLabelConstraints.fill = GridBagConstraints.NONE;
            deviceLabelConstraints.anchor = GridBagConstraints.WEST;
            deviceLabelConstraints.insets = new Insets(0, 0, 0, 4);
            innerPane.add(deviceLabel, deviceLabelConstraints);
        }

        {
            GridBagConstraints comboBoxConstraints = new GridBagConstraints();
            comboBoxConstraints.gridx = 1;
            comboBoxConstraints.gridy = 0;
            comboBoxConstraints.weightx = 1;
            comboBoxConstraints.weighty = 0;
            comboBoxConstraints.fill = GridBagConstraints.HORIZONTAL;
            comboBoxConstraints.anchor = GridBagConstraints.EAST;
            innerPane.add(comboBox, comboBoxConstraints);
        }

        {
            GridBagConstraints detailTextAreaConstraints = new GridBagConstraints();
            detailTextAreaConstraints.gridx = 0;
            detailTextAreaConstraints.gridy = 2;
            detailTextAreaConstraints.gridwidth = 2;
            detailTextAreaConstraints.weightx = 1;
            detailTextAreaConstraints.weighty = 1;
            detailTextAreaConstraints.fill = GridBagConstraints.BOTH;
            detailTextAreaConstraints.anchor = GridBagConstraints.WEST;
            detailTextAreaConstraints.insets = new Insets(4, 0, 4, 0);
            innerPane.add(detailScrollPane, detailTextAreaConstraints);
        }

        {
            GridBagConstraints cancelButtonConstraints = new GridBagConstraints();
            cancelButtonConstraints.gridx = 0;
            cancelButtonConstraints.gridy = 3;
            cancelButtonConstraints.weightx = 0;
            cancelButtonConstraints.weighty = 0;
            cancelButtonConstraints.fill = GridBagConstraints.NONE;
            cancelButtonConstraints.anchor = GridBagConstraints.WEST;
            innerPane.add(cancelButton, cancelButtonConstraints);
        }

        {
            GridBagConstraints okButtonConstraints = new GridBagConstraints();
            okButtonConstraints.gridx = 1;
            okButtonConstraints.gridy = 3;
            okButtonConstraints.weightx = 0;
            okButtonConstraints.weighty = 0;
            okButtonConstraints.fill = GridBagConstraints.NONE;
            okButtonConstraints.anchor = GridBagConstraints.EAST;
            innerPane.add(okButton, okButtonConstraints);
        }

        innerPane.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        this.setContentPane(innerPane);

        this.setSize(480, 360);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public Integer selectedDeviceId = null;
}
