package cn.cls.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.cls.blog.entity.OperationLog;
import cn.cls.blog.service.OperationLogService;
import cn.cls.blog.mapper.OperationLogMapper;
import org.springframework.stereotype.Service;

/**
 * @author CLS
 * @description 针对表【tb_operation_log】的数据库操作Service实现
 * @createDate 2022-11-07 19:30:49
 */
@Service
public class OperationLogServiceImpl extends ServiceImpl<OperationLogMapper, OperationLog>
        implements OperationLogService {

}




