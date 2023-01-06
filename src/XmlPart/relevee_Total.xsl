<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:xs="http://www.w3.org/2001/XMLSchema"
    exclude-result-prefixes="xs"
    version="2.0">
       <xsl:template match="/">
           <html>
               <head>
                   <h1>All Operations :: PARTIE A Questions 4 et 5</h1>
               </head>
               <body>
                   <xsl:for-each select="/relevee">
                            <div>
                                <p>
                                    Operations for RIB : <xsl:value-of select="@RIB"></xsl:value-of>
                               </p>
                                <h4>Informations : </h4>
                                 <ul>
                                     <li>
                                         Date Releve :<xsl:value-of select="dateReleve"></xsl:value-of>
                                     </li>
                                     <li>
                                         Solde Actuel : <xsl:value-of select="solde"></xsl:value-of> DH
                                     </li>
                                 </ul>
                               <hr/>
                            </div>
                            <div>
                                <b>Operations:</b>
                                <table border="1">
                                    <tr>
                                        <th>TYPE</th>
                                        <th>Date</th>
                                        <th>Montant</th>
                                        <th>Description</th>
                                    </tr>
                                    <xsl:for-each select="operations/operation[@type='CREDIT']">
                                        <tr>
                                            <td>
                                                <xsl:value-of select="@type"></xsl:value-of>
                                            </td>
                                            <td>
                                                <xsl:value-of select="@date"></xsl:value-of>
                                            </td>
                                            <td>
                                                <xsl:value-of select="@montant"></xsl:value-of>
                                            </td>
                                            <td>
                                                <xsl:value-of select="@description"></xsl:value-of>
                                            </td>
                                        </tr>
                                    </xsl:for-each>
                                    <tr>
                                        <td>
                                            Total CREDIT
                                        </td>
                                        <td colspan="3">
                                            <xsl:value-of select="sum(operations/operation[@type='CREDIT']/@montant)"></xsl:value-of>
                                        </td>
                                    </tr>
                                    <xsl:for-each select="operations/operation[@type='DEBIT']">
                                        <tr>
                                            <td>
                                                <xsl:value-of select="@type"></xsl:value-of>
                                            </td>
                                            <td>
                                                <xsl:value-of select="@date"></xsl:value-of>
                                            </td>
                                            <td>
                                                <xsl:value-of select="@montant"></xsl:value-of>
                                            </td>
                                            <td>
                                                <xsl:value-of select="@description"></xsl:value-of>
                                            </td>
                                        </tr>
                                    </xsl:for-each>
                                    <tr>
                                        <td>
                                            Total DEBIT
                                        </td>
                                        <td colspan="3">
                                            <xsl:value-of select="sum(operations/operation[@type='DEBIT']/@montant)"></xsl:value-of>
                                        </td>
                                    </tr>
                                </table>
                            </div>
                   </xsl:for-each> 
               </body>
           </html>
       </xsl:template>
</xsl:stylesheet>