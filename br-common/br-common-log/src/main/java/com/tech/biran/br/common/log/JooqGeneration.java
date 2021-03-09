package com.tech.biran.br.common.log;


import org.jooq.codegen.GenerationTool;
import org.jooq.meta.jaxb.*;

import java.io.File;

/**
 * @author yzp
 * @date 2020/8/2 17:52
 */
public class JooqGeneration {
    public static void main(String[] args) throws Exception {
        Configuration configuration = new Configuration();
        configuration
                .withJdbc(new Jdbc()
                        .withDriver("com.mysql.cj.jdbc.Driver")
                        .withUrl("jdbc:mysql://rm-bp158bh6ph4ek6f503o.mysql.rds.aliyuncs.com:3306/test")
                        .withUser("lims")
                        .withPassword("Lims@002"))
                .withGenerator(new Generator()
                        .withDatabase(new Database()
                                .withName("org.jooq.meta.mysql.MySQLDatabase")
                                .withInputSchema("test")
                                .withRecordVersionFields("version")
                                .withRecordTimestampFields("update_time")
                        )
                        .withGenerate(
                                new Generate().withJavaTimeTypes(true)
                        )
                        .withTarget(new Target()
                                .withDirectory(new File("").getCanonicalPath() + "/br-common/br-common-log/src/main/java/")
                                .withPackageName("com.tech.biran.br.common.log.db")
                                .withEncoding("UTF-8")
                                .withClean(true)
                        ));
        GenerationTool.generate(configuration);

    }
}


