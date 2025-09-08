package com.liang.yupicturebackend.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.liang.yupicturebackend.model.dto.picture.PictureQueryRequest;
import com.liang.yupicturebackend.model.dto.picture.PictureUploadRequest;
import com.liang.yupicturebackend.model.entity.Picture;
import com.liang.yupicturebackend.model.vo.PictureVO;
import org.springframework.web.multipart.MultipartFile;
import com.liang.yupicturebackend.model.entity.User;

import javax.servlet.http.HttpServletRequest;

/**
* @author 套你猴子
* @description 针对表【picture(图片)】的数据库操作Service
* @createDate 2025-09-08 11:31:17
*/
public interface PictureService extends IService<Picture> {

    /**
     * 上传图片
     *
     * @param multipartFile
     * @param pictureUploadRequest
     * @param loginUser
     * @return
     */
    PictureVO uploadPicture(MultipartFile multipartFile,
                            PictureUploadRequest pictureUploadRequest,
                            User loginUser);

    void validPicture(Picture picture);

    PictureVO getPictureVO(Picture picture, HttpServletRequest request);

    Wrapper<Picture> getQueryWrapper(PictureQueryRequest pictureQueryRequest);

    Page<PictureVO> getPictureVOPage(Page<Picture> picturePage, HttpServletRequest request);
}
