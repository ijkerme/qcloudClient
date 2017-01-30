/*
 * Copyright (C) 2017 Benny~
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */

import com.benny.utilities.util;
import com.qcloud.Utilities.Json.*;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Benny~
 */
public class Console extends javax.swing.JFrame {
    //set var
    private String cName,cDiskID,cInstanceID,cRegion,cSnapshotID;
    private String load;
    private JSONObject json=new JSONObject();
    private final Map cAuth=new HashMap();
    private final util rebuild=new util();
        /**
     * Creates new form Console
     */
    public Console() {
        initComponents();
        setLocationRelativeTo(null);
        hostStatus.setRowHeight(40);
        snapshotList.setRowHeight(40);
        reboot.setVisible(false);
        power.setVisible(false);
        reset.setVisible(false);

    }
    
   
    //ser var fun
    /**
     * 设置成员变量给Console
     * @param s
     *          服务器名字
     * @param id
     *          secretID
     * @param key 
     *          secretKey
     */
    public void setVar(String s, String id, String key) {
        cAuth.put("secretId", id);
        cAuth.put("secretKey", key);
        cName = s;
        hostTab.setTitleAt(0, cName);
        this.setTitle("控制台 - " + cName + "");    
    }
    /**
     * 提示用户加载中
     */
    private void loading() {
        load = this.getTitle();
        this.setTitle(load + "  加载中...请稍候");
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this
     * method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();
        hostTab = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        hostSet = new javax.swing.JTabbedPane();
        instance = new javax.swing.JPanel();
        gz = new javax.swing.JRadioButton();
        sh = new javax.swing.JRadioButton();
        bj = new javax.swing.JRadioButton();
        hk = new javax.swing.JRadioButton();
        sg = new javax.swing.JRadioButton();
        ca = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        hostStatus = new javax.swing.JTable();
        reboot = new javax.swing.JButton();
        power = new javax.swing.JButton();
        su = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        snapshot = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        snapshotList = new javax.swing.JTable();
        create = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        restore = new javax.swing.JButton();

        jMenuItem1.setText("说明");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);
        jPopupMenu1.add(jSeparator1);

        jMenuItem2.setText("关于");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/com/benny/images/ico.png")));
        setResizable(false);

        hostTab.setToolTipText("");

        hostSet.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        hostSet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hostSetMouseClicked(evt);
            }
        });

        instance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                instanceMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                instanceMouseReleased(evt);
            }
        });

        buttonGroup1.add(gz);
        gz.setText("广州");
        gz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gzMouseClicked(evt);
            }
        });

        buttonGroup1.add(sh);
        sh.setText("上海");
        sh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                shMouseClicked(evt);
            }
        });

        buttonGroup1.add(bj);
        bj.setText("北京");
        bj.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bjMouseClicked(evt);
            }
        });

        buttonGroup1.add(hk);
        hk.setText("香港");
        hk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hkMouseClicked(evt);
            }
        });

        buttonGroup1.add(sg);
        sg.setText("新加坡");
        sg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sgMouseClicked(evt);
            }
        });

        buttonGroup1.add(ca);
        ca.setText("北美");
        ca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                caMouseClicked(evt);
            }
        });

        hostStatus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "实例ID/主机名", "状态", "操作系统", "配置", "磁盘类型", "IP地址", "到期日期"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        hostStatus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hostStatusMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(hostStatus);

        reboot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/benny/images/reboot.png"))); // NOI18N
        reboot.setToolTipText("重启");
        reboot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rebootMouseClicked(evt);
            }
        });

        power.setPreferredSize(new java.awt.Dimension(64, 64));
        power.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                powerMouseClicked(evt);
            }
        });

        su.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/benny/images/su.png"))); // NOI18N
        su.setToolTipText("切换用户");
        su.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                suMouseClicked(evt);
            }
        });

        reset.setToolTipText("重装系统");
        reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resetMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout instanceLayout = new javax.swing.GroupLayout(instance);
        instance.setLayout(instanceLayout);
        instanceLayout.setHorizontalGroup(
            instanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(instanceLayout.createSequentialGroup()
                .addGroup(instanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(instanceLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(gz)
                        .addGap(10, 10, 10)
                        .addComponent(sh)
                        .addGap(18, 18, 18)
                        .addComponent(bj)
                        .addGap(18, 18, 18)
                        .addComponent(hk)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sg)
                        .addGap(10, 10, 10)
                        .addComponent(ca))
                    .addGroup(instanceLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 886, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(instanceLayout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(power, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(141, 141, 141)
                        .addComponent(reboot, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(152, 152, 152)
                        .addComponent(su, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(148, 148, 148)
                        .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        instanceLayout.setVerticalGroup(
            instanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(instanceLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(instanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(instanceLayout.createSequentialGroup()
                        .addGroup(instanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gz)
                            .addComponent(sh)
                            .addComponent(bj)
                            .addComponent(hk)
                            .addComponent(sg)
                            .addComponent(ca))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(134, 134, 134)
                        .addGroup(instanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(su, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(power, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(reboot, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(150, Short.MAX_VALUE))
        );

        hostSet.addTab("实例", instance);

        snapshotList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "id", "名称", "状态", "创建百分比", "创建时间"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        snapshotList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                snapshotListMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(snapshotList);

        create.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/benny/images/create.png"))); // NOI18N
        create.setToolTipText("创建快照");
        create.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createMouseClicked(evt);
            }
        });

        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/benny/images/delete.png"))); // NOI18N
        delete.setToolTipText("删除快照");
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
        });

        restore.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/benny/images/restore.png"))); // NOI18N
        restore.setToolTipText("回滚快照");
        restore.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                restoreMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout snapshotLayout = new javax.swing.GroupLayout(snapshot);
        snapshot.setLayout(snapshotLayout);
        snapshotLayout.setHorizontalGroup(
            snapshotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(snapshotLayout.createSequentialGroup()
                .addGroup(snapshotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(snapshotLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 816, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(snapshotLayout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(create, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(133, 133, 133)
                        .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(173, 173, 173)
                        .addComponent(restore, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        snapshotLayout.setVerticalGroup(
            snapshotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(snapshotLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(snapshotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(create, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(restore, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86))
        );

        hostSet.addTab("快照", snapshot);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hostSet)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hostSet)
        );

        hostTab.addTab("服务器名称", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hostTab, javax.swing.GroupLayout.PREFERRED_SIZE, 1069, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hostTab, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * 把表清空
     */
    private void clearTable(){
        for(int i=0;i<hostStatus.getRowCount();i++)
            for (int j=0;j<hostStatus.getColumnCount();j++)
                hostStatus.setValueAt(null, i, j);
    }
    /**
     * 
     * @param json
     *              接受json参数
     * @param row 
     *              行数
     */
    private void setHostStatus(JSONObject json){
   
    ///////得到了查询的结果，然后再次调用util的方法getIV      
        
        if ("0".equals(json.get("totalCount").toString())) {
            JOptionPane.showMessageDialog(rootPane, "在 *" + cRegion + "* 未查询到服务器", "提示", JOptionPane.INFORMATION_MESSAGE);
            clearTable();
            cDiskID=null;
            return;
        } else {
            System.out.println(json.getJSONArray("instanceSet").length());
        }
        for (int row = 0; row < json.getJSONArray("instanceSet").length(); row++) {
            cInstanceID=rebuild.getIV(json, row, "unInstanceId");
            hostStatus.setValueAt(rebuild.getIV(json, row, "unInstanceId") + "·" + rebuild.getIV(json, row, "instanceName"), row, 0);
            hostStatus.setValueAt(rebuild.getIV(json, row, "status"), row, 1);
            hostStatus.setValueAt(rebuild.getIV(json, row, "os"), row, 2);
            hostStatus.setValueAt(rebuild.getIV(json, row, "cpu") + "核 "
                + rebuild.getIV(json, row, "mem") + "G "
                + rebuild.getIV(json, row, "bandwidth") + "Mbps ", row, 3);
            hostStatus.setValueAt(rebuild.getIV(json, row, "diskInfo"), row, 4);
            hostStatus.setValueAt(rebuild.getIV(json, row, "wanIpSet").replace('[', ' ').replace(']', ' ').replace('"', ' ').trim(),
                row, 5);
            hostStatus.setValueAt(rebuild.getIV(json, row, "deadlineTime"), row, 6);
        }
    }
    /**
     * 
     * @param action 
     *              要进行的操作名，i.e. DescribeInstances
     */
    private void actOnOrder(String action){
            String rg = null;
            if (gz.isSelected()) 
                rg = "gz";           
            if (sh.isSelected()) 
                rg = "sh";            
            if (bj.isSelected()) 
                rg = "bj";          
            if (hk.isSelected()) 
                rg = "hk";          
            if (sg.isSelected()) 
                rg = "sg";          
            if (ca.isSelected()) 
                rg = "ca";        
        cInstanceID = hostStatus.getValueAt(hostStatus.getSelectedRow(), 0).toString().substring(0, 12);
        rebuild.doInstance(cAuth, rg, cInstanceID, action); //传递action  
            if(action=="StartInstances")
                JOptionPane.showMessageDialog(rootPane, "开机指令已发出", "提示", JOptionPane.INFORMATION_MESSAGE);
             if(action=="StopInstances")
                JOptionPane.showMessageDialog(rootPane, "关机指令已发出", "提示", JOptionPane.INFORMATION_MESSAGE);
              if(action=="RestartInstances")
                JOptionPane.showMessageDialog(rootPane, "重启指令已发出", "提示", JOptionPane.INFORMATION_MESSAGE);
            //设置其他按钮为不可用
        reboot.setEnabled(false);
        power.setEnabled(false);
        
    }
    /**
     * 
     * @return 
     *          实例状态
     */
    private String checkStatus(){
    
        String rg = null;
            if (gz.isSelected()) 
                rg = "gz";           
            if (sh.isSelected()) 
                rg = "sh";            
            if (bj.isSelected()) 
                rg = "bj";          
            if (hk.isSelected()) 
                rg = "hk";          
            if (sg.isSelected()) 
                rg = "sg";          
            if (ca.isSelected()) 
                rg = "ca";        
        cInstanceID = hostStatus.getValueAt(hostStatus.getSelectedRow(), 0).toString().substring(0, 12);
        return rebuild.doInstance(cAuth, rg, cInstanceID, "DescribeInstances").
               getJSONArray("instanceSet").getJSONObject(hostStatus.getSelectedRow()).get("status").toString();
   
    }
    
    private void bjMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bjMouseClicked
        // TODO add your handling code here:   
        //重用    cRegion 北京   
        loading();
        rebuild.doInstance(cAuth, bj.getText(), null, "DescribeInstances");
        json = rebuild.json_result;
        cRegion = "北京";
        setHostStatus(json);
        this.setTitle(load);
        
    }//GEN-LAST:event_bjMouseClicked

    private void shMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shMouseClicked
        // TODO add your handling code here:  
        loading();
        rebuild.doInstance(cAuth, sh.getText(), null, "DescribeInstances");
        json = rebuild.json_result;
        cRegion = "上海";
        setHostStatus(json);
        this.setTitle(load);
    }//GEN-LAST:event_shMouseClicked

    private void gzMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gzMouseClicked
        // TODO add your handling code here:
        loading();
        rebuild.doInstance(cAuth, gz.getText(), null, "DescribeInstances");
        json = rebuild.json_result;
        cRegion = "广州";
        setHostStatus(json);
        this.setTitle(load);
    }//GEN-LAST:event_gzMouseClicked

    private void hkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hkMouseClicked
        // TODO add your handling code here:
        loading();
        rebuild.doInstance(cAuth, hk.getText(), null, "DescribeInstances");
        json = rebuild.json_result;
        cRegion = "香港";
        setHostStatus(json);
        this.setTitle(load);
    }//GEN-LAST:event_hkMouseClicked

    private void sgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sgMouseClicked
        // TODO add your handling code here:
        loading();
        rebuild.doInstance(cAuth, sg.getText(), null, "DescribeInstances");
        json = rebuild.json_result;
        cRegion = "新加坡";
        setHostStatus(json);
        this.setTitle(load);
    }//GEN-LAST:event_sgMouseClicked

    private void caMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_caMouseClicked
        // TODO add your handling code here:
        loading();
        rebuild.doInstance(cAuth, ca.getText(), null, "DescribeInstances");
        json = rebuild.json_result;
        cRegion = "北美";
        setHostStatus(json);
        this.setTitle(load);
    }//GEN-LAST:event_caMouseClicked

    private void rebootMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rebootMouseClicked
        // TODO add your handling code here:
        //如果未选中，结果是-1；否则是0,1,2,3,4...
        if (hostStatus.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(rootPane, "未选择服务器", "提示", JOptionPane.WARNING_MESSAGE);
            return;
        }
        int op = JOptionPane.showConfirmDialog(rootPane, "确定要重启吗", "提示", JOptionPane.YES_NO_OPTION);
        //点是返回0，否返回1，有悖常理啊      
        if (op == 0) 
            actOnOrder("RestartInstances");
        else
            System.out.println("操作已取消");
        
        
    }//GEN-LAST:event_rebootMouseClicked

    private void hostStatusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hostStatusMouseClicked
        // TODO add your handling code here:显示三个控制按钮
        //让它犯难
        //hostStatus.setValueAt("蓝瘦香菇", 0, 1);
        if (hostStatus.getValueAt(hostStatus.getSelectedRow(), 0) != null) {
            reboot.setVisible(true);
            power.setVisible(true);
            reset.setVisible(true);
            cDiskID = rebuild.uDiskID;                       
        }

        if (hostStatus.getValueAt(hostStatus.getSelectedRow(), 1) == "运行中") {
            power.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/benny/images/poweroff.png")));
            power.setToolTipText("关机");
        } else if (hostStatus.getValueAt(hostStatus.getSelectedRow(), 1) == "已关机") {
            power.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/benny/images/poweron.png")));
            power.setToolTipText("开机");
            reboot.setVisible(false);
        } else {
            power.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/benny/images/unknow.png")));
            power.setToolTipText("嗷呜等等吧");
            power.setVisible(false);
            reboot.setVisible(false);
            reset.setVisible(false);
        }
    }//GEN-LAST:event_hostStatusMouseClicked

    private void powerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_powerMouseClicked
        // TODO add your handling code here:执行关机或者重启任务
        int op = JOptionPane.showConfirmDialog(rootPane, "确定要" + power.getToolTipText() + "吗", "提示", JOptionPane.OK_OPTION);
        if (power.getToolTipText() == "开机" && op == 0)
            actOnOrder("StartInstances");
        else if (power.getToolTipText() == "关机" && op == 0)
            actOnOrder("StopInstances");
        else if (power.getToolTipText() == "嗷呜等等吧" && op == 0)
            JOptionPane.showMessageDialog(rootPane, "叫你等，你还点，哼", "哼", JOptionPane.WARNING_MESSAGE);
        else
            System.out.println("操作已取消");
        
    }//GEN-LAST:event_powerMouseClicked

    private void hostSetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hostSetMouseClicked
        // TODO add your handling code here:获取快照信息.
        //这里有个隐藏的信息，是查询所有快照啊！假如用户有两个以上不同主机的快照呢。
        //根据diskID过滤下？
        loading();
        if (cDiskID == null && hostSet.getSelectedIndex() == 1) {
            JOptionPane.showMessageDialog(rootPane, "未选择主机", "提示", JOptionPane.INFORMATION_MESSAGE);
            hostSet.setSelectedIndex(0);
            this.setTitle(load); 
            return;
        }
        //执行API
        json = rebuild.doSnapshot(cAuth, cRegion, null, "DescribeSnapshots", null);
        for (int row = 0; row < json.getJSONArray("snapshotSet").length(); row++) {   
            //设置快照表格
            snapshotList.setValueAt(rebuild.getSV(json, row, "snapshotId"), row, 0);
            snapshotList.setValueAt(rebuild.getSV(json, row, "snapshotName"), row, 1);
            snapshotList.setValueAt(rebuild.getSV(json, row, "snapshotStatus"), row, 2);
            snapshotList.setValueAt(rebuild.getSV(json, row, "percent"), row, 3);
            snapshotList.setValueAt(rebuild.getSV(json, row, "createTime"), row, 4);

        }
        restore.setVisible(false);
        delete.setVisible(false);
        this.setTitle(load);       
    }//GEN-LAST:event_hostSetMouseClicked

    private void snapshotListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_snapshotListMouseClicked
        // TODO add your handling code here:回滚快照、删除快照这三个按钮的状态
        if (snapshotList.getValueAt(snapshotList.getSelectedRow(), 0) != null) {
            restore.setVisible(true);
            delete.setVisible(true);
            cSnapshotID = snapshotList.getValueAt(snapshotList.getSelectedRow(), 0).toString();
        } else if (snapshotList.getValueAt(snapshotList.getSelectedRow(), 0) == null) {
            restore.setVisible(false);
            delete.setVisible(false);
        }
        
        
    }//GEN-LAST:event_snapshotListMouseClicked

    private void createMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createMouseClicked
        // TODO add your handling code here:创建快照
        String snapshotName = null;
        snapshotName = JOptionPane.showInputDialog(null, "请输入快照名称（可选）", "提示", JOptionPane.INFORMATION_MESSAGE);
        if (gz.isSelected()) 
                cRegion = "gz";           
        if (sh.isSelected()) 
                cRegion = "sh";            
        if (bj.isSelected()) 
                cRegion = "bj";          
        if (hk.isSelected()) 
                cRegion = "hk";          
        if (sg.isSelected()) 
                cRegion = "sg";          
        if (ca.isSelected()) 
                cRegion = "ca";  
      
        if (snapshotName == null) {
            System.out.println("操作已取消");
        } else {
            rebuild.doSnapshot(cAuth, cRegion, cDiskID, "CreateSnapshot", snapshotName);
            JOptionPane.showMessageDialog(null, "创建快照指令已发出", "提示", JOptionPane.INFORMATION_MESSAGE);
            hostSetMouseClicked(evt);
        }
    }//GEN-LAST:event_createMouseClicked

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
        // TODO add your handling code here:删除快照
        int op = JOptionPane.showConfirmDialog(rootPane, "确定要删除吗", "提示", JOptionPane.YES_NO_OPTION);
        //点是返回0，否返回1，有悖常理啊    
        String snapshotID = null;
        snapshotID = snapshotList.getValueAt(snapshotList.getSelectedRow(), 0).toString();
        if (op == 0) {
            rebuild.doSnapshot(cAuth, cRegion, snapshotID, "DeleteSnapshot", null);
            JOptionPane.showMessageDialog(null, "删除快照指令已发出", "提示", JOptionPane.INFORMATION_MESSAGE);
            DefaultTableModel tableModel = (DefaultTableModel) snapshotList.getModel();
            tableModel.removeRow(snapshotList.getSelectedRow());
        }    
        else
            System.out.println("操作已取消");
        
        
        
        
    }//GEN-LAST:event_deleteMouseClicked

    private void restoreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_restoreMouseClicked
        // TODO add your handling code here:还原快照
        
        int op = JOptionPane.showConfirmDialog(rootPane, "程序将会为你关机、执行还原、然后再开机，你确认吗？", "提示", JOptionPane.YES_NO_OPTION);
        //点是返回0，否返回1，有悖常理啊    
        String snapshotID = null;
        String snapshotStat = null;
        snapshotID = snapshotList.getValueAt(snapshotList.getSelectedRow(), 0).toString();
        /*snapshotList.getValueAt(snapshotList.getSelectedRow(), 0).toString();*/
        snapshotStat = rebuild.doSnapshot(cAuth, cRegion, cDiskID, "DescribeSnapshots", null).getJSONArray("snapshotSet").getJSONObject(
                       snapshotList.getSelectedRow()).get("snapshotStatus").toString();
        //System.out.println("problem is here "+snapshotStat);
        if (op == 0) {
            try {

                actOnOrder("StopInstances");
                while (true) {
                    Thread.sleep(2500);
                    if ("4".equals(checkStatus())) 
                        break;                  
                }

                rebuild.doSnapshot(cAuth, cRegion, cDiskID, "ApplySnapshot", snapshotID);
                JOptionPane.showMessageDialog(null, "还原指令已发出", "提示", JOptionPane.INFORMATION_MESSAGE);
                while (true) {
                    Thread.sleep(2500);
                    snapshotStat = rebuild.doSnapshot(cAuth, cRegion, cDiskID, "DescribeSnapshots", null).getJSONArray("snapshotSet").getJSONObject(
                        snapshotList.getSelectedRow()).get("snapshotStatus").toString();
                    if ("rollbacking".equals(snapshotStat))//查询快照                  
                        System.out.println("回滚中");
                     else 
                        break;                  
                }
                actOnOrder("StartInstances");
            } catch (InterruptedException ex) {
                Logger.getLogger(Console.class.getName()).log(Level.SEVERE, null, ex);
            }

        }       
        else
            System.out.println("操作已取消");
              
    }//GEN-LAST:event_restoreMouseClicked

    private void instanceMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_instanceMousePressed
        // TODO add your handling code here:
        if (evt.isPopupTrigger()) 
            showPopupMenu(evt);
        
    }//GEN-LAST:event_instanceMousePressed

    private void instanceMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_instanceMouseReleased
        // TODO add your handling code here:
        if (evt.isPopupTrigger()) 
            showPopupMenu(evt);
        
    }//GEN-LAST:event_instanceMouseReleased

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "鼠标点击就好了，就是酱紫。如遇bug欢迎回报\n网址：https://www.bennythink.com", 
            "使用说明", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "由Benny于2017年1月24日发布。请注意，本软件无任何保证。\n斯人若彩虹，遇上方知有。",
            "关于", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void suMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suMouseClicked
        // TODO add your handling code here:切换用户
        
        Login su = new Login();
        su.setVisible(true);
        this.dispose();
        
        
    }//GEN-LAST:event_suMouseClicked

    private void resetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetMouseClicked
        // TODO add your handling code here:重装系统
        Reset newWindow=new Reset();
        //System.out.println("console instanceid? "+cInstanceID);
        newWindow.rInstanceID=cInstanceID;
        newWindow.rAuth=cAuth;
        newWindow.rRegion=cRegion;
        newWindow.setVisible(true);
        
    }//GEN-LAST:event_resetMouseClicked

    private void showPopupMenu(MouseEvent e) {
        jPopupMenu1.show(this, e.getX(), e.getY());
}
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Console.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Console.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Console.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Console.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Console().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton bj;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton ca;
    private javax.swing.JButton create;
    private javax.swing.JButton delete;
    private javax.swing.JRadioButton gz;
    private javax.swing.JRadioButton hk;
    private javax.swing.JTabbedPane hostSet;
    private javax.swing.JTable hostStatus;
    private javax.swing.JTabbedPane hostTab;
    private javax.swing.JPanel instance;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JButton power;
    private javax.swing.JButton reboot;
    private javax.swing.JButton reset;
    private javax.swing.JButton restore;
    private javax.swing.JRadioButton sg;
    private javax.swing.JRadioButton sh;
    private javax.swing.JPanel snapshot;
    private javax.swing.JTable snapshotList;
    private javax.swing.JButton su;
    // End of variables declaration//GEN-END:variables
}
